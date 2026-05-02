//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
import util.DBUtil;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        // 直接调用！不用写一长串连接代码
        Connection conn = DBUtil.getConnection();

        if (conn != null) {
            System.out.println("✅ 数据库连接成功！");
            DBUtil.close(conn);
        } else {
            System.out.println("❌ 连接失败");
        }
    }
}