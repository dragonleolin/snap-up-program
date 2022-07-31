# snap-up program 搶購程式

### 1. 建置SpringBoot專案
### 2. 在POM檔加入需要用的套件
  ![image](https://user-images.githubusercontent.com/42775462/182010513-afab6494-83a3-4bb8-8611-814363bd84cb.png)
## 3. 加入Chrome driver讓程式可以啟動自己的瀏覽器
    ```
    System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files (x86)\\Google\\Chrome\\Application\\chromedriver.exe");
    ```
## 4. 使用定位網頁元素 
      參考文章: https://www.cnblogs.com/tester-ggf/p/12602211.html
      
### 5. 網頁需要停頓一下去讀取元素，用Thread.sleep(1 * 1000);

  
