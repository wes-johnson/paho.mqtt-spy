package pl.baczkowicz.mqttspy.sparkplug;

import org.eclipse.tahu.message.PayloadDecoder;
import org.eclipse.tahu.message.SparkplugBPayloadDecoder;
import org.eclipse.tahu.message.model.SparkplugBPayload;
import org.eclipse.tahu.util.PayloadUtil;

public class SparkplugPayloadFormatter {

	public static String format(byte[] data) {
		try {
			PayloadDecoder<SparkplugBPayload> decoder = new SparkplugBPayloadDecoder();
			SparkplugBPayload payload = decoder.buildFromByteArray(data);
			return PayloadUtil.toJsonString(payload);
		} catch (Exception e) {
			return e.getLocalizedMessage();
		}
	}
}
