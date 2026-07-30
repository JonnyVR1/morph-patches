package com.idv.identity.platform.model;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;
import com.idv.identity.platform.log.RecordService;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class IDCardOcrProResult {

    @JSONField(name = "bizCode")
    private String bizCode;

    @JSONField(name = "bizMessage")
    private String bizMessage;

    @JSONField(name = "docParamConfig")
    private String docParamConfig = "";

    @JSONField(name = "docType")
    private String docType;

    @JSONField(name = "ocrResult")
    private String ocrResult;

    @JSONField(name = "ocrStandardData")
    private String ocrStandardData;

    @JSONField(name = "pageNo")
    private int pageNo;

    @JSONField(serialize = false)
    private Map<String, Object> sortedOcrResult;

    private boolean isValid() {
        return true;
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public String getBizMessage() {
        return this.bizMessage;
    }

    public String getDocParamConfig() {
        return this.docParamConfig;
    }

    public String getDocType() {
        return this.docType;
    }

    public String getOcrResult() {
        return this.ocrResult;
    }

    public String getOcrStandardData() {
        return this.ocrStandardData;
    }

    public Map<String, Object> getOcrStandardDataMap() {
        String str = this.ocrStandardData;
        if (str == null) {
            return null;
        }
        return (Map) JSON.parseObject(str, HashMap.class);
    }

    public int getPageNo() {
        return this.pageNo;
    }

    public Map<String, Object> getSortedOcrResult() {
        return this.sortedOcrResult;
    }

    public boolean isOCRError() {
        if (isValid()) {
            return "CODE_OCR_FAILED".equalsIgnoreCase(this.bizCode);
        }
        return false;
    }

    public boolean isOCRPictureQualityNotGood() {
        if (isValid()) {
            return "CODE_OCR_FAILED_COMPLIANCE".equalsIgnoreCase(this.bizCode);
        }
        return false;
    }

    public boolean isOCRSuccess() {
        if (isValid()) {
            return "CODE_OCR_SUCCESS".equalsIgnoreCase(this.bizCode);
        }
        return false;
    }

    public boolean isOCRTypeError() {
        if (isValid()) {
            return "CODE_OCR_WRONG_CARD".equalsIgnoreCase(this.bizCode);
        }
        return false;
    }

    public void setBizCode(String str) {
        this.bizCode = str;
    }

    public void setBizMessage(String str) {
        this.bizMessage = str;
    }

    public void setDocParamConfig(String str) {
        this.docParamConfig = str;
    }

    public void setDocType(String str) {
        this.docType = str;
    }

    public void setOcrResult(String str) {
        this.ocrResult = str;
    }

    public void setOcrStandardData(String str) {
        this.ocrStandardData = str;
    }

    public void setPageNo(int i) {
        this.pageNo = i;
    }

    public void sortOcrResult() {
        String str = this.docParamConfig;
        if (str == null) {
            return;
        }
        try {
            List<String> array = JSON.parseArray(str, String.class);
            HashMap map = new HashMap();
            String str2 = this.ocrResult;
            if (str2 != null) {
                map = (HashMap) JSON.parseObject(str2, HashMap.class);
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str3 : array) {
                if (map.containsKey(str3)) {
                    linkedHashMap.put(str3, map.get(str3));
                } else {
                    linkedHashMap.put(str3, "");
                }
            }
            this.sortedOcrResult = linkedHashMap;
        } catch (Exception e) {
            RecordService.getInstance().recordException(e);
        }
    }

    public String toString() {
        return "IDCardOcrProResult{bizCode='" + this.bizCode + "', bizMessage='" + this.bizMessage + "', docParamConfig='" + this.docParamConfig + "', docType='" + this.docType + "', pageNo=" + this.pageNo + ", ocrResult=" + this.ocrResult + ", sortedOcrResult=" + this.sortedOcrResult + '}';
    }
}
