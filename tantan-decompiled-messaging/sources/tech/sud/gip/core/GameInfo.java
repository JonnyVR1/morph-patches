package tech.sud.gip.core;

import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.Serializable;
import p149l.pdg0;

/* JADX INFO: loaded from: classes3.dex */
public class GameInfo implements Serializable {
    public String bigLoadingPic;
    public long clientVersion;
    public String desc;
    public String etCorePath;
    public pdg0 gameLargeModelCfg;
    public String gamePath;
    public String loadingPic;
    public long mgId;
    public String name;
    public String[] tags = new String[0];
    public String version = "";
    public int orientation = 1;
    public int screenMode = 1;
    public String url = "";
    public String eUrl = "";
    public String autUrl = "";
    public String appID = "";
    public String hash = "";
    public String[] require = new String[0];
    public String dynamicConfig = WeJson.EMPTY_MAP;
    public int engine = 1;
    public int unityFrameworkType = 0;
    public boolean isInstalled = false;
}
