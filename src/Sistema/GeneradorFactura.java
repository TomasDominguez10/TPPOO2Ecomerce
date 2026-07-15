package Sistema;

import Pedido.Pedido;

public class GeneradorFactura implements  susbsistema {


        private ComprobanteFiscal comprobanteFiscal;

        public GeneradorFactura(ComprobanteFiscal comprobanteFiscal) {
            this.comprobanteFiscal = comprobanteFiscal;
        }

        @Override
        public void cambioAEntregado(Pedido pedido) {
            this.comprobanteFiscal.generarComprobante(pedido);
        }

        @Override
        public void cambioAEnviado(Pedido pedido) { }

        @Override
        public void cambioACancelado(Pedido pedido) { }

        @Override
        public void cambioAConfirmado(Pedido pedido) { }
    }
}
