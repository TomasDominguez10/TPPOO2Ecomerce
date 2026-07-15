package Formato;

import Reporte.ReportePorductosMasVendidos;

public class FormatoTxt implements Formato {
    private String estadoDeNegocio;

    @Override
    public void visitar(@org.jetbrains.annotations.UnknownNullability ReportePorductosMasVendidos reporte) {
        StringBuilder sb = new StringBuilder();
        sb.append("Item | Cantidad | Precio promedio\n");

        reporte.getEstadisticas().forEach((clave, valor) -> {
            sb.append(clave)
                    .append(" | ")
                    .append(valor.getCantidadTotal())
                    .append(" | ")
                    .append(valor.getMontoTotal())
                    .append("\n");
        });

        this.estadoDeNegocio = sb.toString();
    }

    @Override
    public String exportar(Reporte reporte) {
        reporte.accept(this);
        return estadoDeNegocio;
    }


}
