package com.p000p1.mobile.putong.core.p004ui.verification;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.Media;
import l.biq;
import l.t100;
import l.vp4;
import l.xdl0;
import p006l.f6c0;
import p006l.qib0;
import p006l.u4c0;
import p006l.upa;
import p006l.x2c0;
import v.AutoVDraweeView;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CertPrivilegeItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f6417c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f6418d;

    /* JADX INFO: renamed from: e */
    public VText_NoTopPadding f6419e;

    /* JADX INFO: renamed from: f */
    public CertPrivilege f6420f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.verification.CertPrivilegeItemView$a */
    public static /* synthetic */ class C0357a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6421a;

        static {
            int[] iArr = new int[CertPrivilege.values().length];
            f6421a = iArr;
            try {
                iArr[CertPrivilege.more_swipe.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6421a[CertPrivilege.priority_recommend.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6421a[CertPrivilege.cert_logo.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6421a[CertPrivilege.high_privacy_setting.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6421a[CertPrivilege.only_look_cert.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public CertPrivilegeItemView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    private void m9398T(String str) {
        SimpleDraweeView vDraweeView = new VDraweeView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.d(230.0f), t100.d(180.0f));
        layoutParams.setMargins(t100.d(40.0f), t100.d(31.0f), 0, 0);
        layoutParams.gravity = 8388611;
        vDraweeView.setLayoutParams(layoutParams);
        this.f6417c.removeAllViews();
        this.f6417c.addView(vDraweeView);
        qib0.f19782G.m12744L0(vDraweeView, str);
    }

    /* JADX INFO: renamed from: P */
    public final void m9399P(View view) {
        vp4.a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m9400Q(CertPrivilege certPrivilege) {
        this.f6420f = certPrivilege;
    }

    /* JADX INFO: renamed from: R */
    public void m9401R() {
        String str;
        String str2;
        int i = C0357a.f6421a[this.f6420f.ordinal()];
        if (i == 1) {
            this.f6418d.setText("更多右滑");
            this.f6419e.setText("每天可额外发出10次喜欢");
            if (upa.m25545z()) {
                str = CoreModule.f1534c.f3628e0.m21490p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ik1PM1k2RTYzVVVIV1BQTzI3WjJVRjNUWjdPTlpWVTE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NjQ5NjQ0MDIzNTc2NTMyMjQ0fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6Ilg2Q09QQjZTQVJVV1o0MlBTUlJaRDNKN09ZVENSWDE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4ODk0ODg3NzUxOTE5OTA1NDh9.webp";
            } else {
                str = CoreModule.f1534c.f3628e0.m21490p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjVDS1NSUEVUUkRPQldBQkhTSlNSQU1CMkNLTUhTWDE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo2NjQ5OTI1NDk4NTUzMjM4Nzg4fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IklVUTdIUUpPMktENUJONVRJUktTWkQ1RUxaTUFMSTE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo4OTAzMzUzOTkxNDY0MjI1MzJ9.webp";
            }
            m9398T(str);
            return;
        }
        if (i == 2 || i == 3 || i == 4) {
            m9402S(this.f6420f);
            return;
        }
        if (i != 5) {
            return;
        }
        this.f6418d.setText("只看认证用户");
        this.f6419e.setText("滑卡只看已完成头像认证的用户");
        if (upa.m25545z()) {
            str2 = CoreModule.f1534c.f3628e0.m21490p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjNPU0tHTkszN0JQTFpaWFozSUdNSVVJRUQ3RFVUWDE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NDI2MDgyMjEyOTk0NzIyMDU3fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IktWTENVWjZSWFRVUFBUR1hVQ05HVDU3Q01GV1hSQjE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxMTAyOTAwNjIzNDMwOTgxODg5fQ.webp";
        } else {
            str2 = CoreModule.f1534c.f3628e0.m21490p9().isFemale() ? "https://fe-static.tancdn.com/v1/images/eyJpZCI6IlJQWDNONFlWNTRHTkNLS0U0NFRDNE9KMkhVNVZFSjE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1NDI2MDgyMjEyOTk0NzIyMDU3fQ.webp" : "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkdHS1lYNzVCV0lZNU5FRlBBRldOUkFIMkJIVU9BSjE0IiwidyI6NjkwLCJoIjo1NDAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1MTM4MTM0NDc5NDk3OTYzNzgxfQ.webp";
        }
        m9398T(str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S */
    public final void m9402S(CertPrivilege certPrivilege) {
        View viewInflate = LayoutInflater.from(getContext()).inflate(f6c0.f12166e1, (ViewGroup) this.f6417c, true);
        AutoVDraweeView autoVDraweeViewFindViewById = viewInflate.findViewById(u4c0.f22702O);
        VImage vImageFindViewById = viewInflate.findViewById(u4c0.f22589H5);
        VImage vImageFindViewById2 = viewInflate.findViewById(u4c0.f22555F5);
        View view = (VImage) viewInflate.findViewById(u4c0.f22538E5);
        if (upa.m25545z()) {
            vImageFindViewById.setImageResource(x2c0.f26603d5);
            vImageFindViewById2.setImageResource(x2c0.f26571c5);
            view.setImageResource(x2c0.f26539b5);
            xdl0.W(vImageFindViewById, t100.d(-35.0f));
            xdl0.U(vImageFindViewById, t100.d(-21.0f));
            xdl0.W(vImageFindViewById2, t100.d(-22.0f));
            xdl0.U(vImageFindViewById2, t100.d(-15.0f));
            xdl0.D0(t100.d(73.0f), new View[]{view});
            xdl0.C0(view, t100.d(30.0f));
        }
        int i = C0357a.f6421a[certPrivilege.ordinal()];
        if (i == 2) {
            autoVDraweeViewFindViewById.setImageUrl(((Media) CoreModule.f1534c.f3628e0.m21490p9().fp()).url);
            this.f6418d.setText("优先推荐");
            this.f6419e.setText("让感兴趣的人优先看到你");
            xdl0.M(vImageFindViewById, true);
            return;
        }
        if (i == 3) {
            autoVDraweeViewFindViewById.setImageUrl(((Media) CoreModule.f1534c.f3628e0.m21490p9().fp()).url);
            this.f6418d.setText("认证标识");
            this.f6419e.setText("点亮专属徽章，展示认证身份");
            xdl0.M(view, true);
            return;
        }
        if (i != 4) {
            return;
        }
        autoVDraweeViewFindViewById.y(((Media) CoreModule.f1534c.f3628e0.m21490p9().fp()).url, new biq(4, 15));
        this.f6418d.setText("高阶隐私设置");
        this.f6419e.setText("你决定谁能看到你，保护你的隐私");
        xdl0.M(vImageFindViewById2, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9399P(this);
    }

    public CertPrivilegeItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CertPrivilegeItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
