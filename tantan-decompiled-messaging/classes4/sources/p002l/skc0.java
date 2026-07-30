package p002l;

import android.text.TextUtils;
import com.p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseGetRedPacketUser;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import com.p1.mobile.putong.live.base.data.BLiveFanBaseRedPacketInfo;
import com.p1.mobile.putong.live.base.data.BLiveMedalColorTemplate;
import com.p1.mobile.putong.live.base.data.BLiveMedalIcon;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.imf0;
import l.vwb;
import l.w9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class skc0 {

    /* JADX INFO: renamed from: a */
    public BLiveFanBaseRedPacketInfo f19062a;

    /* JADX INFO: renamed from: b */
    public List<C0818a> f19063b = new ArrayList();

    /* JADX INFO: renamed from: l.skc0$a */
    public static class C0818a {

        /* JADX INFO: renamed from: a */
        public String f19064a;

        /* JADX INFO: renamed from: b */
        public String f19065b;

        /* JADX INFO: renamed from: c */
        public String f19066c;

        /* JADX INFO: renamed from: d */
        public int f19067d;

        /* JADX INFO: renamed from: e */
        public String f19068e;

        /* JADX INFO: renamed from: f */
        public String f19069f;

        /* JADX INFO: renamed from: g */
        public String f19070g;

        /* JADX INFO: renamed from: h */
        public BLiveCommonViewConfig f19071h;

        public C0818a(BLiveCommonViewConfig bLiveCommonViewConfig) {
            this.f19071h = bLiveCommonViewConfig;
            this.f19070g = bLiveCommonViewConfig.text;
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Boolean m22508c(BLiveMedalColorTemplate bLiveMedalColorTemplate) {
            return Boolean.valueOf(TextUtils.equals(bLiveMedalColorTemplate.name, this.f19071h.color));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Boolean m22509d(BLiveMedalIcon bLiveMedalIcon) {
            return Boolean.valueOf(TextUtils.equals(bLiveMedalIcon.name, this.f19071h.icon));
        }

        /* JADX INFO: renamed from: e */
        public c<imf0> m22510e() {
            BLiveMedalColorTemplate bLiveMedalColorTemplate;
            if ((TextUtils.isEmpty(this.f19068e) || TextUtils.isEmpty(this.f19069f)) && (bLiveMedalColorTemplate = (BLiveMedalColorTemplate) vwb.r(zfv.m27320z0(this.f19067d, null), new w9j() { // from class: l.qkc0
                public final Object call(Object obj) {
                    return this.f18076a.m22508c((BLiveMedalColorTemplate) obj);
                }
            })) != null) {
                this.f19068e = bLiveMedalColorTemplate.backgroundUrl;
                BLiveMedalIcon bLiveMedalIcon = (BLiveMedalIcon) vwb.r(bLiveMedalColorTemplate.icons, new w9j() { // from class: l.rkc0
                    public final Object call(Object obj) {
                        return this.f18587a.m22509d((BLiveMedalIcon) obj);
                    }
                });
                if (bLiveMedalIcon != null) {
                    this.f19069f = bLiveMedalIcon.url;
                }
            }
            return h9g.m14302l(this.f19068e, this.f19069f, this.f19070g);
        }
    }

    public skc0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo, final List<BLiveFanBaseMedal> list, final BLiveCommonViewConfig bLiveCommonViewConfig) {
        this.f19062a = bLiveFanBaseRedPacketInfo;
        if (bLiveCommonViewConfig == null) {
            return;
        }
        vwb.z(bLiveFanBaseRedPacketInfo.histories, new e30() { // from class: l.okc0
            public final void call(Object obj) {
                this.f16680a.m22505c(bLiveCommonViewConfig, list, (BLiveFanBaseGetRedPacketUser) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m22505c(BLiveCommonViewConfig bLiveCommonViewConfig, List list, final BLiveFanBaseGetRedPacketUser bLiveFanBaseGetRedPacketUser) {
        C0818a c0818a = new C0818a(bLiveCommonViewConfig);
        c0818a.f19064a = bLiveFanBaseGetRedPacketUser.avatarUrl;
        c0818a.f19065b = bLiveFanBaseGetRedPacketUser.grabbedGiftContent.giftUrl;
        c0818a.f19066c = bLiveFanBaseGetRedPacketUser.name;
        BLiveFanBaseMedal bLiveFanBaseMedal = (BLiveFanBaseMedal) vwb.r(list, new w9j() { // from class: l.pkc0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveFanBaseMedal) obj).userId, bLiveFanBaseGetRedPacketUser.userID));
            }
        });
        if (bLiveFanBaseMedal != null) {
            c0818a.f19067d = bLiveFanBaseMedal.grade;
        }
        this.f19063b.add(c0818a);
    }
}
