package com.effectsar.labcv.licenselibrary;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public interface HttpRequestProvider {

    public static class RequestInfo {
        public String url = "";
        public HashMap<String, String> requestHead = new HashMap<>();
        public String bodydata = "";
        public int bodySize = 0;
        public long userdata = 0;
    }

    public static class ResponseInfo {
        public boolean isSuc = false;
        public int status_code = 0;
        public HashMap<String, String> responseHead = new HashMap<>();
        public String bodydata = "";
        public int bodySize = 0;
        public long userdata = 0;
    }

    ResponseInfo getRequest(RequestInfo requestInfo);

    ResponseInfo postRequest(RequestInfo requestInfo);
}
