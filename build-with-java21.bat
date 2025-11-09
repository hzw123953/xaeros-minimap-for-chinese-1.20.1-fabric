@echo off
echo 使用Java 21构建Xaero's Minimap汉化模组...
set JAVA_HOME=D:\my\Javajdk21
echo 已设置JAVA_HOME=%JAVA_HOME%
echo.
echo 清理项目...
gradlew.bat clean
if %ERRORLEVEL% neq 0 (
    echo 清理失败，退出
    pause
    exit /b 1
)
echo.
echo 开始构建...
gradlew.bat build
if %ERRORLEVEL% neq 0 (
    echo 构建失败
    pause
    exit /b 1
)
echo.
echo 构建完成！
echo 生成的模组文件位于: build\libs\
echo.
pause