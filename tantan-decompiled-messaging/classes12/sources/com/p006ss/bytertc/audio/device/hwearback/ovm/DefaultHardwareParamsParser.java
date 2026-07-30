package com.p006ss.bytertc.audio.device.hwearback.ovm;

import com.p006ss.bytertc.audio.device.base.ManufacturerChecker;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class DefaultHardwareParamsParser implements IHardwareParamsParser {
    private int parseFlags(String str) {
        int i = 0;
        for (String str2 : str.split("\\|")) {
            str2.getClass();
            switch (str2) {
                case "AUDIO_OUTPUT_FLAG_FAST":
                case "AUDIO_INPUT_FLAG_ROW":
                    i |= 4;
                    break;
                case "AUDIO_INPUT_FLAG_FAST":
                    i |= 1;
                    break;
                case "AUDIO_OUTPUT_FLAG_DEEP_BUFFER":
                    i |= 8;
                    break;
            }
        }
        return i;
    }

    private int parseInt(String str, int i) {
        return str.equals("default") ? i : Integer.parseInt(str);
    }

    @Override // com.p006ss.bytertc.audio.device.hwearback.ovm.IHardwareParamsParser
    public HardwareEarbackParams parse(String str) {
        int i;
        try {
            JSONObject jSONObject = new JSONObject(str);
            HardwareEarbackParams hardwareEarbackParams = new HardwareEarbackParams();
            hardwareEarbackParams.playParamsList = new ArrayList();
            hardwareEarbackParams.recordParamsList = new ArrayList();
            if (jSONObject.has("audioTrackParam")) {
                try {
                    JSONArray jSONArray = jSONObject.getJSONArray("audioTrackParam");
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        HardwareEarbackParams.Play play = new HardwareEarbackParams.Play();
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                        String string = jSONObject2.getString("streamType");
                        String string2 = jSONObject2.getString("sampleRate");
                        String string3 = jSONObject2.getString("format");
                        String string4 = jSONObject2.getString("flag");
                        play.streamType = parseInt(string, 3);
                        play.sampleRate = parseInt(string2, 48000);
                        play.format = parseInt(string3, 2);
                        play.version = 0;
                        if (string4.contains("|")) {
                            play.flags = parseFlags(string4);
                            play.version = 1;
                        } else if (string4.startsWith("0x")) {
                            play.flags = Integer.parseInt(string4.substring(2), 16);
                        } else {
                            play.flags = parseInt(string4, -1);
                        }
                        hardwareEarbackParams.playParamsList.add(play);
                    }
                } catch (Exception unused) {
                }
            }
            if (jSONObject.has("audioRecordParam")) {
                try {
                    JSONArray jSONArray2 = jSONObject.getJSONArray("audioRecordParam");
                    for (int i3 = 0; i3 < jSONArray2.length(); i3++) {
                        HardwareEarbackParams.Record record = new HardwareEarbackParams.Record();
                        JSONObject jSONObject3 = jSONArray2.getJSONObject(i3);
                        String string5 = jSONObject3.getString("sampleRate");
                        String string6 = jSONObject3.getString("format");
                        String string7 = jSONObject3.getString("flag");
                        String string8 = jSONObject3.getString("source");
                        record.sampleRate = parseInt(string5, 48000);
                        record.format = parseInt(string6, 2);
                        record.version = 0;
                        if (string7.contains("|")) {
                            record.flags = parseFlags(string7);
                            record.version = 1;
                            i = 0;
                        } else {
                            if (string7.startsWith("0x")) {
                                record.flags = Integer.parseInt(string7.substring(2), 16);
                            } else if (ManufacturerChecker.getManufacturerType() == ManufacturerChecker.Type.OP && "8".equals(string7)) {
                                record.flags = -1;
                            } else {
                                record.flags = parseInt(string7, -1);
                            }
                            i = 0;
                        }
                        record.source = parseInt(string8, i);
                        hardwareEarbackParams.recordParamsList.add(record);
                    }
                } catch (Exception unused2) {
                }
            }
            return hardwareEarbackParams;
        } catch (JSONException unused3) {
            return null;
        }
    }
}
