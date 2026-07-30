package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveCommonViewConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseGetRedPacketUser;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseMedal;
import com.p051p1.mobile.putong.live.base.data.BLiveFanBaseRedPacketInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveMedalColorTemplate;
import com.p051p1.mobile.putong.live.base.data.BLiveMedalIcon;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes4.dex */
public class zsc0 {

    /* JADX INFO: renamed from: a */
    public BLiveFanBaseRedPacketInfo f205862a;

    /* JADX INFO: renamed from: b */
    public List<C21884a> f205863b = new ArrayList();

    /* JADX INFO: renamed from: l.zsc0$a */
    public static class C21884a {

        /* JADX INFO: renamed from: a */
        public String f205864a;

        /* JADX INFO: renamed from: b */
        public String f205865b;

        /* JADX INFO: renamed from: c */
        public String f205866c;

        /* JADX INFO: renamed from: d */
        public int f205867d;

        /* JADX INFO: renamed from: e */
        public String f205868e;

        /* JADX INFO: renamed from: f */
        public String f205869f;

        /* JADX INFO: renamed from: g */
        public String f205870g;

        /* JADX INFO: renamed from: h */
        public BLiveCommonViewConfig f205871h;

        public C21884a(BLiveCommonViewConfig bLiveCommonViewConfig) {
            this.f205871h = bLiveCommonViewConfig;
            this.f205870g = bLiveCommonViewConfig.text;
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Boolean m221331c(BLiveMedalColorTemplate bLiveMedalColorTemplate) {
            return Boolean.valueOf(TextUtils.equals(bLiveMedalColorTemplate.name, this.f205871h.color));
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Boolean m221332d(BLiveMedalIcon bLiveMedalIcon) {
            return Boolean.valueOf(TextUtils.equals(bLiveMedalIcon.name, this.f205871h.icon));
        }

        /* JADX INFO: renamed from: e */
        public C22421c<ruf0> m221333e() {
            BLiveMedalColorTemplate bLiveMedalColorTemplate;
            if ((TextUtils.isEmpty(this.f205868e) || TextUtils.isEmpty(this.f205869f)) && (bLiveMedalColorTemplate = (BLiveMedalColorTemplate) jyb.m147529r(aiv.m98151z0(this.f205867d, null), new qcj() { // from class: l.xsc0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f196079a.m221331c((BLiveMedalColorTemplate) obj);
                }
            })) != null) {
                this.f205868e = bLiveMedalColorTemplate.backgroundUrl;
                BLiveMedalIcon bLiveMedalIcon = (BLiveMedalIcon) jyb.m147529r(bLiveMedalColorTemplate.icons, new qcj() { // from class: l.ysc0
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return this.f201390a.m221332d((BLiveMedalIcon) obj);
                    }
                });
                if (bLiveMedalIcon != null) {
                    this.f205869f = bLiveMedalIcon.url;
                }
            }
            return vag.m200518l(this.f205868e, this.f205869f, this.f205870g);
        }
    }

    public zsc0(BLiveFanBaseRedPacketInfo bLiveFanBaseRedPacketInfo, final List<BLiveFanBaseMedal> list, final BLiveCommonViewConfig bLiveCommonViewConfig) {
        this.f205862a = bLiveFanBaseRedPacketInfo;
        if (bLiveCommonViewConfig == null) {
            return;
        }
        jyb.m147537z(bLiveFanBaseRedPacketInfo.histories, new y20() { // from class: l.vsc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185593a.m221328c(bLiveCommonViewConfig, list, (BLiveFanBaseGetRedPacketUser) obj);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m221328c(BLiveCommonViewConfig bLiveCommonViewConfig, List list, final BLiveFanBaseGetRedPacketUser bLiveFanBaseGetRedPacketUser) {
        C21884a c21884a = new C21884a(bLiveCommonViewConfig);
        c21884a.f205864a = bLiveFanBaseGetRedPacketUser.avatarUrl;
        c21884a.f205865b = bLiveFanBaseGetRedPacketUser.grabbedGiftContent.giftUrl;
        c21884a.f205866c = bLiveFanBaseGetRedPacketUser.name;
        BLiveFanBaseMedal bLiveFanBaseMedal = (BLiveFanBaseMedal) jyb.m147529r(list, new qcj() { // from class: l.wsc0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((BLiveFanBaseMedal) obj).userId, bLiveFanBaseGetRedPacketUser.userID));
            }
        });
        if (bLiveFanBaseMedal != null) {
            c21884a.f205867d = bLiveFanBaseMedal.grade;
        }
        this.f205863b.add(c21884a);
    }
}
