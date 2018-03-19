set current_path = %~dp0

cd %1

java -Xmx1024M -cp .\libs\robocode.jar robocode.Robocode -battle <Set this to the path of the misc folder in your project>\battles.battle -results <Set this to the path of the misc folder in your project>\results.txt