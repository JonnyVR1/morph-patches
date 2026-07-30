package tech.sud.logger;

import tech.sud.base.utils.Utils;
import tech.sud.base.utils.UtilsBridge;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class Sudcase {
    public final String Suddo;
    public String Sudif;
    public String Sudfor = "util";
    public boolean Sudint = true;
    public boolean Sudnew = true;
    public boolean Sudtry = true;
    public int Sudbyte = -1;
    public final String Sudcase = UtilsBridge.getCurrentProcessName();
    public final UtilsBridge.FileHead Sudchar = new UtilsBridge.FileHead("Log");
    public final boolean Sudelse = true;
    public long Sudgoto = 20971520;
    public int Sudlong = 4;

    public Sudcase() {
        if (!UtilsBridge.isSDCardEnableByEnvironment() || Utils.getApp().getExternalFilesDir(null) == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(Utils.getApp().getFilesDir());
            String str = LogUtils.Sudif;
            sb.append(str);
            sb.append("log");
            sb.append(str);
            this.Suddo = sb.toString();
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Utils.getApp().getExternalFilesDir(null));
        String str2 = LogUtils.Sudif;
        sb2.append(str2);
        sb2.append("log");
        sb2.append(str2);
        this.Suddo = sb2.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("process: ");
        String str = this.Sudcase;
        sb.append(str == null ? "" : str.replace(":", "_"));
        String str2 = LogUtils.LINE_SEP;
        sb.append(str2);
        sb.append("logSwitch: true");
        sb.append(str2);
        sb.append("consoleSwitch: ");
        sb.append(this.Sudint);
        sb.append(str2);
        sb.append("tag: null");
        UtilsBridge.isSpace("");
        sb.append(str2);
        sb.append("headSwitch: ");
        sb.append(this.Sudnew);
        sb.append(str2);
        sb.append("fileSwitch: false");
        sb.append(str2);
        sb.append("dir: ");
        String str3 = this.Sudif;
        if (str3 == null) {
            str3 = this.Suddo;
        }
        sb.append(str3);
        sb.append(str2);
        sb.append("filePrefix: ");
        sb.append(this.Sudfor);
        sb.append(str2);
        sb.append("borderSwitch: ");
        sb.append(this.Sudtry);
        sb.append(str2);
        sb.append("singleTagSwitch: true");
        sb.append(str2);
        sb.append("consoleFilter: ");
        char[] cArr = LogUtils.Suddo;
        sb.append(cArr[0]);
        sb.append(str2);
        sb.append("fileFilter: ");
        sb.append(cArr[0]);
        sb.append(str2);
        sb.append("stackDeep: 1");
        sb.append(str2);
        sb.append("stackOffset: 0");
        sb.append(str2);
        sb.append("saveDays: ");
        sb.append(this.Sudbyte);
        sb.append(str2);
        sb.append("formatter: ");
        sb.append(LogUtils.Sudcase);
        sb.append(str2);
        sb.append("fileWriter: null");
        sb.append(str2);
        sb.append("onConsoleOutputListener: null");
        sb.append(str2);
        sb.append("onFileOutputListener: null");
        sb.append(str2);
        sb.append("fileExtraHeader: ");
        sb.append(this.Sudchar.getAppended());
        return sb.toString();
    }
}
