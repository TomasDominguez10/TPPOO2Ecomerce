package Formato;

import Reporte.ReportePorductosMasVendidos;

public class FormatoCsv implements Formato {
    private String estadoDeNegocio;

    @Override
    public void visitar(@org.jetbrains.annotations.UnknownNullability ReportePorductosMasVendidos reporte) {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto,Cantidad,PrecioPromedio\n");

        reporte.getEstadisticas().forEach((clave, valor) -> {
            sb.append(clave)
                    .append(",")
                    .append(valor.getCantidadTotal())
                    .append(",")
                    .append(valor.getMontoTotal())
                    .append("\n");
        });

        this.estadoDeNegocio = sb.toString();
    }

    @Override

    public String exportar(Reporte reporte) {
        reporte.accept(this);
        return this.estadoDeNegocio;
    }

}
