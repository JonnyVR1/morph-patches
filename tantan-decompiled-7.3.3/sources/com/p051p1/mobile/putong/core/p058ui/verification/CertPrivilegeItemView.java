package com.p051p1.mobile.putong.core.p058ui.verification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.putong.core.CoreModule;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText_NoTopPadding;
import p153l.adc0;
import p153l.bkq;
import p153l.bnl0;
import p153l.dbc0;
import p153l.gra;
import p153l.kec0;
import p153l.qa00;
import p153l.uq4;
import p153l.uqb0;

/* JADX INFO: loaded from: classes12.dex */
public class CertPrivilegeItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f37484c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f37485d;

    /* JADX INFO: renamed from: e */
    public VText_NoTopPadding f37486e;

    /* JADX INFO: renamed from: f */
    public CertPrivilege f37487f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verification.CertPrivilegeItemView$a */
    public static /* synthetic */ class C9084a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37488a;

        static {
            int[] iArr = new int[CertPrivilege.values().length];
            f37488a = iArr;
            try {
                iArr[CertPrivilege.more_swipe.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37488a[CertPrivilege.priority_recommend.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37488a[CertPrivilege.cert_logo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37488a[CertPrivilege.high_privacy_setting.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37488a[CertPrivilege.only_look_cert.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public CertPrivilegeItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: T */
    private void m57163T(String str) {
        SimpleDraweeView vDraweeView = new VDraweeView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(230.0f), qa00.m175859d(180.0f));
        layoutParams.setMargins(qa00.m175859d(40.0f), qa00.m175859d(31.0f), 0, 0);
        layoutParams.gravity = 8388611;
        vDraweeView.setLayoutParams(layoutParams);
        this.f37484c.removeAllViews();
        this.f37484c.addView(vDraweeView);
        uqb0.f180374G.m127115L0(vDraweeView, str);
    }

    /* JADX INFO: renamed from: P */
    public final void m57164P(View view) {
        uq4.m197216a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m57165Q(CertPrivilege certPrivilege) {
        this.f37487f = certPrivilege;
    }

    /* JADX INFO: renamed from: R */
    public void m57166R() {
        String str;
        String str2;
        int i = C9084a.f37488a[this.f37487f.ordinal()];
        if (i == 1) {
            this.f37485d.setText("更多右滑");
            this.f37486e.setText("每天可额外发出10次喜欢");
            if (gra.m131778z()) {
                str = CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ik1PM1k2RTYzVVVIV1BQTzI3WjJVRjNUWjdPTlpWVTE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NjQ5NjQ0MDIzNTc2NTMyMjQ0fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ilg2Q09QQjZTQVJVV1o0MlBTUlJaRDNKN09ZVENSWDE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4ODk0ODg3NzUxOTE5OTA1NDh9.webp";
            } else {
                str = CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjVDS1NSUEVUUkRPQldBQkhTSlNSQU1CMkNLTUhTWDE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NjQ5OTI1NDk4NTUzMjM4Nzg4fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IklVUTdIUUpPMktENUJONVRJUktTWkQ1RUxaTUFMSTE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4OTAzMzUzOTkxNDY0MjI1MzJ9.webp";
            }
            m57163T(str);
            return;
        }
        if (i == 2 || i == 3 || i == 4) {
            m57167S(this.f37487f);
            return;
        }
        if (i != 5) {
            return;
        }
        this.f37485d.setText("只看认证用户");
        this.f37486e.setText("滑卡只看已完成头像认证的用户");
        if (gra.m131778z()) {
            str2 = CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjNPU0tHTkszN0JQTFpaWFozSUdNSVVJRUQ3RFVUWDE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NDI2MDgyMjEyOTk0NzIyMDU3fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IktWTENVWjZSWFRVUFBUR1hVQ05HVDU3Q01GV1hSQjE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTAyOTAwNjIzNDMwOTgxODg5fQ.webp";
        } else {
            str2 = CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlJQWDNONFlWNTRHTkNLS0U0NFRDNE9KMkhVNVZFSjE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NDI2MDgyMjEyOTk0NzIyMDU3fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkdHS1lYNzVCV0lZNU5FRlBBRldOUkFIMkJIVU9BSjE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1MTM4MTM0NDc5NDk3OTYzNzgxfQ.webp";
        }
        m57163T(str2);
    }

    /* JADX INFO: renamed from: S */
    public final void m57167S(CertPrivilege certPrivilege) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(kec0.f125806e1, (ViewGroup) this.f37484c, true);
        AutoVDraweeView autoVDraweeView = (AutoVDraweeView) viewInflate.findViewById(adc0.f70042O);
        VImage vImage = (VImage) viewInflate.findViewById(adc0.f69963J5);
        VImage vImage2 = (VImage) viewInflate.findViewById(adc0.f69929H5);
        VImage vImage3 = (VImage) viewInflate.findViewById(adc0.f69912G5);
        if (gra.m131778z()) {
            vImage.setImageResource(dbc0.f86945e5);
            vImage2.setImageResource(dbc0.f86913d5);
            vImage3.setImageResource(dbc0.f86880c5);
            bnl0.m105539W(vImage, qa00.m175859d(-35.0f));
            bnl0.m105537U(vImage, qa00.m175859d(-21.0f));
            bnl0.m105539W(vImage2, qa00.m175859d(-22.0f));
            bnl0.m105537U(vImage2, qa00.m175859d(-15.0f));
            bnl0.m105507D0(qa00.m175859d(73.0f), vImage3);
            bnl0.m105505C0(vImage3, qa00.m175859d(30.0f));
        }
        int i = C9084a.f37488a[certPrivilege.ordinal()];
        if (i == 2) {
            autoVDraweeView.setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url);
            this.f37485d.setText("优先推荐");
            this.f37486e.setText("让感兴趣的人优先看到你");
            bnl0.m105524M(vImage, true);
            return;
        }
        if (i == 3) {
            autoVDraweeView.setImageUrl(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url);
            this.f37485d.setText("认证标识");
            this.f37486e.setText("点亮专属徽章，展示认证身份");
            bnl0.m105524M(vImage3, true);
            return;
        }
        if (i != 4) {
            return;
        }
        autoVDraweeView.m224134y(CoreModule.f18264c.f20381e0.m116600p9().m61308fp().url, new bkq(4, 15));
        this.f37485d.setText("高阶隐私设置");
        this.f37486e.setText("你决定谁能看到你，保护你的隐私");
        bnl0.m105524M(vImage2, true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57164P(this);
    }

    public CertPrivilegeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CertPrivilegeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
