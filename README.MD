

## 欢迎参加平安普惠面试-时钟

Set Theory Clock是一个通过亮灯数量来表示时间的时钟，如图所示：

![HERE](images/settheoryclock.gif)

在钟的顶端有一盏每两秒钟闪烁一次的黄灯。
前两排的灯为红色，每排4盏，共8盏，表示小时，其中第一排每盏灯代表5小时；第二排每盏灯代表1小时。（例如：第一排的两个灯和第二排的三个灯点亮，对应时间为5+5+3=13h或1 pm）
底部两排的灯表示分钟，第一排有11盏灯，每盏灯代表5分钟，其中第3、第6和第9盏的灯是红色，表示15分、30分和45分，其他的灯为黄色；最后一排有4盏灯，每盏灯代表1分钟。

## 简述

您需要让Set Theory Clock的测试用例通过。另外，请您在代码上标注相关的注释，以便我们理解您的思路。

## 提示

如果您没有使用过Gradle，您可能需要花点时间阅读一篇Gradle相关的摘要。另外，案例中我们使用了Gradle Wrapper，因此从命令行中的gradlew会下载您所需的所有内容。

## 评分标准
* 所有测试用例需无错执行。
* 需正确理解题目要求。
* 良好的编码习惯及面向对象的设计思想。
* 请在截止日期前提交您的答案。



## 其他
请填写文件 [FEEDBACK.md](FEEDBACK.md)

 
# #测试结果

 测试日志：
 When the time is 00:00:00
2018-04-10T23:32:42.534 | 1-thread-1 | TimeConverterImpl    | DEBUG  - 小时为：0,分钟为：0,秒为：0 
2018-04-10T23:32:42.534 | 1-thread-1 | TimeConverterImpl    | DEBUG  - 我的转换结果为：
Y
OOOO
OOOO
OOOOOOOOOOO
OOOO 
Then the clock should look like
Y
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Middle of the afternoon
When the time is 13:17:01
2018-04-10T23:32:42.542 | 1-thread-1 | TimeConverterImpl    | DEBUG  - 小时为：13,分钟为：17,秒为：1 
2018-04-10T23:32:42.542 | 1-thread-1 | TimeConverterImpl    | DEBUG  - 我的转换结果为：
O
RROO
RRRO
YYROOOOOOOO
YYOO 
Then the clock should look like
O
RROO
RRRO
YYROOOOOOOO
YYOO

Scenario: Just before midnight
When the time is 23:59:59
2018-04-10T23:32:42.546 | 1-thread-1 | TimeConverterImpl    | DEBUG  - 小时为：23,分钟为：59,秒为：59 
2018-04-10T23:32:42.546 | 1-thread-1 | TimeConverterImpl    | DEBUG  - 我的转换结果为：
O
RRRR
RRRO
YYRYYRYYRYY
YYYY 
Then the clock should look like
O
RRRR
RRRO
YYRYYRYYRYY
YYYY

Scenario: Midnight
When the time is 24:00:00
2018-04-10T23:32:42.551 | 1-thread-1 | TimeConverterImpl    | DEBUG  - 小时为：24,分钟为：0,秒为：0 
2018-04-10T23:32:42.551 | 1-thread-1 | TimeConverterImpl    | DEBUG  - 我的转换结果为：
Y
RRRR
RRRR
OOOOOOOOOOO
OOOO 
Then the clock should look like
Y
RRRR
RRRR
OOOOOOOOOOO
OOOO



(AfterStories)

Generating reports view to 'F:\mystudy\paic-arch-set-theory-clock-27627ce9a285\out\test\jbehave' using formats '[stats, html, console]' and view properties '{defaultFormats=stats, decorateNonHtml=true, viewDirectory=view, decorated=ftl/jbehave-report-decorated.ftl, reports=ftl/jbehave-reports-with-totals.ftl, maps=ftl/jbehave-maps.ftl, navigator=ftl/jbehave-navigator.ftl, views=ftl/jbehave-views.ftl, nonDecorated=ftl/jbehave-report-non-decorated.ftl}'
Reports view generated with 1 stories (of which 0 pending) containing 4 scenarios (of which 0 pending)

