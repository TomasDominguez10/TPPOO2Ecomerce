package Formato;

import Reporte.ReportePorductosMasVendidos;

public interface Formato {
    String  exportar(Reporte reporte);

    void    visitar(ReportePorductosMasVendidos reporte);
}
