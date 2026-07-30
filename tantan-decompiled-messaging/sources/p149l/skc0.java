package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseGetRedPacketUser;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import com.p046p1.mobile.putong.live.base.data.BLiveFanBaseRedPacketInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveMedalColorTemplate;
import com.p046p1.mobile.putong.live.base.data.BLiveMedalIcon;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes4.dex */
public class skc0 {

    /* JADX INFO: renamed from: a */
    public BLiveFanBaseRedPacketInfo f164951a;

    /* JADX INFO: renamed from: b */
    public List<C19970a> f164952b = new ArrayList();

    /* JADX INFO: renamed from: l.skc0$a */
    public static class C19970a {

        /* JADX INFO: renamed from: a */
        public String f164953a;

        /* JADX INFO: renamed from: b */
        public String f164954b;

        /* JADX INFO: renamed from: c */
        public String f164955c;

        /* JADX INFO: renamed from: d */
        public int f164956d;

        /* JADX INFO: renamed from: e */
        public String f164957e;

        /* JADX INFO: renamed from: f */
        public String f164958f;

        /* JADX INFO: renamed from: g */
        public String f164959g;

        /* JADX INFO: renamed from: h */
        public BLiveCommonViewConfig f164960h;

        public C19970a(BLiveCommonViewConfig bLiveCommonViewConfig) {
            this.f164960h = bLiveCommonViewConfig;
            this.f164959g = bLiveCommonViewConfig.text;
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Boolean m184583c(BLiveMedalColorTemplate bLiveMedalColorTemplate) {
            return Boolean.valueOf(TextUtils.equals(bLiveMedalColorTemplate.name, this.f164960h.color));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Boolean m184584d(BLiveMedalIcon bLiveMedalIcon) {
            return Boolean.valueOf(TextUtils.equals(bLiveMedalIcon.name, this.f164960h.icon));
        }

        /* JADX INFO: renamed from: e */
        public C22306c<imf0> m184585e() {
            BLiveMedalColorTemplate bLiveMedalColorTemplate;
            if ((TextUtils.isEmpty(this.f164957e) || TextUtils.isEmpty(this.f164958f)) && (bLiveMedalColorTemplate = (BLiveMedalColorTemplate) vwb.m200346r(zfv.m218617z0(this.f164956d, null), new w9j() { // from class: l.qkc0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f155098a.m184583c((BLiveMedalColorTemplate) obj);
                }
            })) != null) {
                this.f164957e = bLiveMedalColorTemplate.backgroundUrl;
                BLiveMedalIcon bLiveMedalIcon = (BLiveMedalIcon) vwb.m200346r(bLiveMedalColorTemplate.icons, new w9j() { // from class: l.rkc0
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return this.f159809a.m184584d((BLiveMedalIcon) obj);
                    }
                });
                if (bLiveMedalIcon != null) {
                    this.f164958f = bLiveMedalIcon.url;
                }
            }
            return h9g.m130003l(this.f164957e, this.f164958f, this.f164959g);
        }
    }

    public skc0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo, final List<BLiveFanBaseMedal> list, final BLiveCommonViewConfig bLiveCommonViewConfig) {
        this.f164951a = bLiveFanBaseRedPacketInfo;
        if (bLiveCommonViewConfig == null) {
            return;
        }
        vwb.m200354z(bLiveFanBaseRedPacketInfo.histories, new e30() { // from class: l.okc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144411a.m184580c(bLiveCommonViewConfig, list, (BLiveFanBaseGetRedPacketUser) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m184580c(BLiveCommonViewConfig bLiveCommonViewConfig, List list, final BLiveFanBaseGetRedPacketUser bLiveFanBaseGetRedPacketUser) {
        C19970a c19970a = new C19970a(bLiveCommonViewConfig);
        c19970a.f164953a = bLiveFanBaseGetRedPacketUser.avatarUrl;
        c19970a.f164954b = bLiveFanBaseGetRedPacketUser.grabbedGiftContent.giftUrl;
        c19970a.f164955c = bLiveFanBaseGetRedPacketUser.name;
        BLiveFanBaseMedal bLiveFanBaseMedal = (BLiveFanBaseMedal) vwb.m200346r(list, new w9j() { // from class: l.pkc0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveFanBaseMedal) obj).userId, bLiveFanBaseGetRedPacketUser.userID));
            }
        });
        if (bLiveFanBaseMedal != null) {
            c19970a.f164956d = bLiveFanBaseMedal.grade;
        }
        this.f164952b.add(c19970a);
    }
}
