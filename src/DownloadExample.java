import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DownloadExample {
    public static void main(String[] args) throws InterruptedException {
        // Thiết lập đường dẫn đến ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\IdeaProjects\\untitled\\driver\\chromedriver.exe");

        // Tạo ChromeOptions và cấu hình tải xuống
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-extensions"); // Vô hiệu hóa tiện ích mở rộng
        options.addArguments("--start-maximized"); // Mở trình duyệt ở chế độ toàn màn hình
        options.addArguments("--disable-popup-blocking"); // Vô hiệu hóa chặn popup

        // Khởi tạo ChromeDriver với ChromeOptions đã cấu hình
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://www.sendspace.com/file/jf33pc");

        // Đợi cho trang tải hoàn thành
        Thread.sleep(5000); // Chờ 5 giây để trang tải hoàn thành

        // Tìm phần tử chứa nút tải xuống
        WebElement downloadButton = driver.findElement(By.id("download_button"));

        // Nhấp vào nút tải xuống
        downloadButton.click();

        // Đợi cho tệp tin tải xuống
        Thread.sleep(5000); // Chờ 5 giây để tệp tin tải xuống

        // Đóng trình duyệt
        driver.quit();
    }
}