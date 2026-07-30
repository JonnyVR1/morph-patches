package p153l;

/* JADX INFO: loaded from: classes9.dex */
public class fm3 {

    /* JADX INFO: renamed from: a */
    public byd0 f99711a = new byd0("last_activities_entry_reddot" + mbs.m157870o0(), 0L, false);

    /* JADX INFO: renamed from: b */
    public jxd0 f99712b;

    /* JADX INFO: renamed from: c */
    public byd0 f99713c;

    /* JADX INFO: renamed from: d */
    public byd0 f99714d;

    /* JADX INFO: renamed from: e */
    public jxd0 f99715e;

    /* JADX INFO: renamed from: f */
    public byd0 f99716f;

    /* JADX INFO: renamed from: g */
    public vbp f99717g;

    /* JADX INFO: renamed from: h */
    public wbp f99718h;

    /* JADX INFO: renamed from: i */
    public jxd0 f99719i;

    /* JADX INFO: renamed from: j */
    public zbp f99720j;

    /* JADX INFO: renamed from: k */
    public jxd0 f99721k;

    public fm3() {
        String str = "need_show_start_live_red_point" + mbs.m157870o0();
        Boolean bool = Boolean.TRUE;
        this.f99712b = new jxd0(str, bool);
        this.f99713c = new byd0("live_sign_time" + mbs.m157870o0(), 0L);
        this.f99714d = new byd0("live_activity_start_live_time" + mbs.m157870o0(), 0L);
        String str2 = "live_square_live_video_show" + mbs.m157870o0();
        Boolean bool2 = Boolean.FALSE;
        this.f99715e = new jxd0(str2, bool2);
        this.f99716f = new byd0("is_show_fake_voiceRedPointToady" + mbs.m157870o0(), 0L);
        this.f99717g = new vbp("intl_frame_cdn_info_" + mbs.m157870o0(), null);
        this.f99718h = new wbp("intl_frame_info_" + mbs.m157870o0(), null);
        this.f99719i = new jxd0("indonesia_chatroom_exp_" + mbs.m157870o0(), bool);
        this.f99720j = new zbp("intl_game_operation_reddot_info_" + mbs.m157870o0(), null);
        this.f99721k = new jxd0("intl_game_tab_has_shown" + mbs.m157870o0(), bool2);
    }

    /* JADX INFO: renamed from: a */
    public long m126173a() {
        return this.f99714d.get().longValue();
    }

    /* JADX INFO: renamed from: b */
    public long m126174b() {
        return this.f99713c.get().longValue();
    }

    /* JADX INFO: renamed from: c */
    public boolean m126175c() {
        return this.f99715e.get().booleanValue();
    }

    /* JADX INFO: renamed from: d */
    public boolean m126176d() {
        return this.f99712b.get().booleanValue();
    }

    /* JADX INFO: renamed from: e */
    public void m126177e() {
        this.f99711a.put(Long.valueOf(System.currentTimeMillis()));
    }

    /* JADX INFO: renamed from: f */
    public void m126178f(long j) {
        this.f99714d.put(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: g */
    public void m126179g(long j) {
        this.f99713c.put(Long.valueOf(j));
    }

    /* JADX INFO: renamed from: h */
    public void m126180h(boolean z) {
        this.f99715e.put(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: i */
    public void m126181i(boolean z) {
        this.f99712b.put(Boolean.valueOf(z));
    }
}
