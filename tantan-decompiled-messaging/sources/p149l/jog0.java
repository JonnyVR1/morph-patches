package p149l;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class jog0 extends kjg0 {

    /* JADX INFO: renamed from: a */
    public int f118974a;

    /* JADX INFO: renamed from: b */
    public final mcg0 f118975b = new mcg0("matchASRInfo");

    /* JADX INFO: renamed from: c */
    public final String f118976c;

    /* JADX INFO: renamed from: d */
    public Boolean f118977d;

    public jog0() {
        this.f118977d = Boolean.FALSE;
        String str = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
        this.f118976c = str;
        String string = cbg0.m105995a("TechSudMGPGlobal.sp").f80140a.getString("key_sud_mgp_match_asr_last_date", "");
        if (TextUtils.isEmpty(string) || !str.equals(string)) {
            return;
        }
        this.f118977d = Boolean.TRUE;
    }
}
