function pretty()
{
	var JSONObject = Java.type("org.json.JSONObject");
	var json = new JSONObject(format());
	return json.toString(10);
}

function format()
{	
	var SparkplugPayloadFormatter = Java.type("pl.baczkowicz.mqttspy.sparkplug.SparkplugPayloadFormatter");
	return SparkplugPayloadFormatter.format(receivedMessage.getRawPayload());
}
