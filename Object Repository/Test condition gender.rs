<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>Test condition gender</name>
   <tag></tag>
   <elementGuidId>798f3eba-06bd-493e-8d07-d9a1ffe814df</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;chusen_group_id\&quot;: ${chusen_group_id},\n  \&quot;conditions\&quot;: [\n    {\n      \&quot;data\&quot;: [\n        {\n          \&quot;type\&quot;: \&quot;${type}\&quot;,\n          \&quot;values\&quot;: {\n            \&quot;reverse_condition\&quot;: ${reverse_condition},\n            \&quot;target\&quot;: \&quot;${target}\&quot;\n          }\n        }\n      ],\n      \&quot;statement\&quot;: \&quot;AND\&quot;\n    }\n  ]\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
   </httpHeaderProperties>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>http://ec2-18-218-187-165.us-east-2.compute.amazonaws.com/api/lotterymanager/get_statistics/develop</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceFunction></soapServiceFunction>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
