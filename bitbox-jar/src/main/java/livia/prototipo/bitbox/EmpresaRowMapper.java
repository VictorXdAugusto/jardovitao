package livia.prototipo.bitbox;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmpresaRowMapper implements RowMapper<Empresa> {

    @Override
    public Empresa mapRow(ResultSet rs, int rowNum) throws SQLException {
        Empresa empresa = new Empresa();
        empresa.setId_empresa(rs.getInt("id_empresa"));
        empresa.setNome(rs.getString("nome"));
        empresa.setCnpj(rs.getString("cnpj"));
        return empresa;
    }

}
