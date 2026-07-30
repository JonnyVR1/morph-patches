package com.p046p1.mobile.putong.core.p053ui.verification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.CoreModule;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText_NoTopPadding;
import p149l.biq;
import p149l.f6c0;
import p149l.qib0;
import p149l.t100;
import p149l.u4c0;
import p149l.upa;
import p149l.vp4;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class CertPrivilegeItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f36636c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f36637d;

    /* JADX INFO: renamed from: e */
    public VText_NoTopPadding f36638e;

    /* JADX INFO: renamed from: f */
    public CertPrivilege f36639f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verification.CertPrivilegeItemView$a */
    public static /* synthetic */ class C8921a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f36640a;

        static {
            int[] iArr = new int[CertPrivilege.values().length];
            f36640a = iArr;
            try {
                iArr[CertPrivilege.more_swipe.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36640a[CertPrivilege.priority_recommend.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36640a[CertPrivilege.cert_logo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36640a[CertPrivilege.high_privacy_setting.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36640a[CertPrivilege.only_look_cert.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public CertPrivilegeItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: T */
    private void m55980T(String str) {
        SimpleDraweeView vDraweeView = new VDraweeView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(230.0f), t100.m186890d(180.0f));
        layoutParams.setMargins(t100.m186890d(40.0f), t100.m186890d(31.0f), 0, 0);
        layoutParams.gravity = 8388611;
        vDraweeView.setLayoutParams(layoutParams);
        this.f36636c.removeAllViews();
        this.f36636c.addView(vDraweeView);
        qib0.f154691G.m102331L0(vDraweeView, str);
    }

    /* JADX INFO: renamed from: P */
    public final void m55981P(View view) {
        vp4.m199220a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m55982Q(CertPrivilege certPrivilege) {
        this.f36639f = certPrivilege;
    }

    /* JADX INFO: renamed from: R */
    public void m55983R() {
        String str;
        String str2;
        int i = C8921a.f36640a[this.f36639f.ordinal()];
        if (i == 1) {
            this.f36637d.setText("更多右滑");
            this.f36638e.setText("每天可额外发出10次喜欢");
            if (upa.m194847z()) {
                str = CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ik1PM1k2RTYzVVVIV1BQTzI3WjJVRjNUWjdPTlpWVTE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NjQ5NjQ0MDIzNTc2NTMyMjQ0fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ilg2Q09QQjZTQVJVV1o0MlBTUlJaRDNKN09ZVENSWDE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4ODk0ODg3NzUxOTE5OTA1NDh9.webp";
            } else {
                str = CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjVDS1NSUEVUUkRPQldBQkhTSlNSQU1CMkNLTUhTWDE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NjQ5OTI1NDk4NTUzMjM4Nzg4fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IklVUTdIUUpPMktENUJONVRJUktTWkQ1RUxaTUFMSTE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4OTAzMzUzOTkxNDY0MjI1MzJ9.webp";
            }
            m55980T(str);
            return;
        }
        if (i == 2 || i == 3 || i == 4) {
            m55984S(this.f36639f);
            return;
        }
        if (i != 5) {
            return;
        }
        this.f36637d.setText("只看认证用户");
        this.f36638e.setText("滑卡只看已完成头像认证的用户");
        if (upa.m194847z()) {
            str2 = CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjNPU0tHTkszN0JQTFpaWFozSUdNSVVJRUQ3RFVUWDE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NDI2MDgyMjEyOTk0NzIyMDU3fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IktWTENVWjZSWFRVUFBUR1hVQ05HVDU3Q01GV1hSQjE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTAyOTAwNjIzNDMwOTgxODg5fQ.webp";
        } else {
            str2 = CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlJQWDNONFlWNTRHTkNLS0U0NFRDNE9KMkhVNVZFSjE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NDI2MDgyMjEyOTk0NzIyMDU3fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkdHS1lYNzVCV0lZNU5FRlBBRldOUkFIMkJIVU9BSjE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1MTM4MTM0NDc5NDk3OTYzNzgxfQ.webp";
        }
        m55980T(str2);
    }

    /* JADX INFO: renamed from: S */
    public final void m55984S(CertPrivilege certPrivilege) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.f95752e1, (ViewGroup) this.f36636c, true);
        AutoVDraweeView autoVDraweeView = (AutoVDraweeView) viewInflate.findViewById(u4c0.f173954O);
        VImage vImage = (VImage) viewInflate.findViewById(u4c0.f173841H5);
        VImage vImage2 = (VImage) viewInflate.findViewById(u4c0.f173807F5);
        VImage vImage3 = (VImage) viewInflate.findViewById(u4c0.f173790E5);
        if (upa.m194847z()) {
            vImage.setImageResource(x2c0.f190067d5);
            vImage2.setImageResource(x2c0.f190035c5);
            vImage3.setImageResource(x2c0.f190003b5);
            xdl0.m208359W(vImage, t100.m186890d(-35.0f));
            xdl0.m208357U(vImage, t100.m186890d(-21.0f));
            xdl0.m208359W(vImage2, t100.m186890d(-22.0f));
            xdl0.m208357U(vImage2, t100.m186890d(-15.0f));
            xdl0.m208327D0(t100.m186890d(73.0f), vImage3);
            xdl0.m208325C0(vImage3, t100.m186890d(30.0f));
        }
        int i = C8921a.f36640a[certPrivilege.ordinal()];
        if (i == 2) {
            autoVDraweeView.setImageUrl(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url);
            this.f36637d.setText("优先推荐");
            this.f36638e.setText("让感兴趣的人优先看到你");
            xdl0.m208344M(vImage, true);
            return;
        }
        if (i == 3) {
            autoVDraweeView.setImageUrl(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url);
            this.f36637d.setText("认证标识");
            this.f36638e.setText("点亮专属徽章，展示认证身份");
            xdl0.m208344M(vImage3, true);
            return;
        }
        if (i != 4) {
            return;
        }
        autoVDraweeView.m222888y(CoreModule.f17545c.f19639e0.m169527p9().m60124fp().url, new biq(4, 15));
        this.f36637d.setText("高阶隐私设置");
        this.f36638e.setText("你决定谁能看到你，保护你的隐私");
        xdl0.m208344M(vImage2, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55981P(this);
    }

    public CertPrivilegeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CertPrivilegeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
