package com.cosmos.photon.push;

import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.log.LogTag;
import com.p046mm.mmfile.IMMFileUploader;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class EventUploaderImpl implements IMMFileUploader {
    private volatile String selfToken;

    @Override // com.p046mm.mmfile.IMMFileUploader
    public boolean upload(File file) {
        if (this.selfToken == null) {
            this.selfToken = PushPreferenceUtils.getPToken();
        }
        MDLog.m7444d(LogTag.STATISTIC, "upload %s", file.getAbsoluteFile());
        HashMap map = new HashMap();
        map.put(file.getName(), file.getAbsolutePath());
        try {
            return PushApi.uploadLogFile(this.selfToken, PhotonPushManager.APP_ID, map);
        } catch (Exception e) {
            MDLog.printErrStackTrace(LogTag.STATISTIC, e);
            return false;
        }
    }
}
