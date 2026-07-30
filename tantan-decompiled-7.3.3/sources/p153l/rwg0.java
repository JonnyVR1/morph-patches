package p153l;

import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class rwg0 extends srg0 {

    /* JADX INFO: renamed from: a */
    public int f165134a;

    /* JADX INFO: renamed from: b */
    public final ukg0 f165135b = new ukg0("matchASRInfo");

    /* JADX INFO: renamed from: c */
    public final String f165136c;

    /* JADX INFO: renamed from: d */
    public Boolean f165137d;

    public rwg0() {
        this.f165137d = Boolean.FALSE;
        String str = new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
        this.f165136c = str;
        String string = kjg0.m150043a("TechSudMGPGlobal.sp").f127100a.getString("key_sud_mgp_match_asr_last_date", "");
        if (TextUtils.isEmpty(string) || !str.equals(string)) {
            return;
        }
        this.f165137d = Boolean.TRUE;
    }
}
