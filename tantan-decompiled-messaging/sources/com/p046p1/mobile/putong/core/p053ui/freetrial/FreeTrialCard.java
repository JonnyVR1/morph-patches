package com.p046p1.mobile.putong.core.p053ui.freetrial;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import org.jetbrains.annotations.NotNull;
import p149l.b6j;
import p149l.d30;
import p149l.z2c0;

/* JADX INFO: loaded from: classes10.dex */
public class FreeTrialCard extends CardView {

    /* JADX INFO: renamed from: a */
    public View f29176a;

    /* JADX INFO: renamed from: b */
    public ImageView f29177b;

    /* JADX INFO: renamed from: c */
    public TextView f29178c;

    /* JADX INFO: renamed from: d */
    public TextView f29179d;

    /* JADX INFO: renamed from: e */
    public TextView f29180e;

    /* JADX INFO: renamed from: f */
    public TextView f29181f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.freetrial.FreeTrialCard$a */
    public static /* synthetic */ class C8334a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29182a;

        static {
            int[] iArr = new int[VirtualCardType.values().length];
            f29182a = iArr;
            try {
                iArr[VirtualCardType.FreeTrialRealUser.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29182a[VirtualCardType.FreeTrialOnline.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29182a[VirtualCardType.FreeTrialPopular.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public FreeTrialCard(@NonNull @NotNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m45412e(View view) {
        b6j.m100407a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m45413f(VirtualCardType virtualCardType, final d30 d30Var) {
        int i = C8334a.f29182a[virtualCardType.ordinal()];
        if (i == 1) {
            m45416j();
        } else if (i == 2) {
            m45414h();
        } else if (i == 3) {
            m45415i();
        }
        this.f29180e.setOnClickListener(new View.OnClickListener() { // from class: l.v5j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m45414h() {
        this.f29176a.setBackgroundResource(z2c0.f201204l);
        this.f29177b.setBackgroundResource(CoreModule.f17545c.f19639e0.m169520na().isFemale() ? z2c0.f201206n : z2c0.f201205m);
        this.f29178c.setText("优先看在线用户");
        this.f29179d.setText("配对后即刻聊天！\n");
        this.f29180e.setTextColor(Color.parseColor("#00cf5f"));
    }

    /* JADX INFO: renamed from: i */
    public final void m45415i() {
        this.f29176a.setBackgroundResource(z2c0.f201207o);
        this.f29177b.setBackgroundResource(CoreModule.f17545c.f19639e0.m169520na().isFemale() ? z2c0.f201209q : z2c0.f201208p);
        this.f29178c.setText("优先看最受欢迎用户");
        this.f29179d.setText("遇见你的理想型！");
        this.f29180e.setTextColor(Color.parseColor("#ffc014"));
    }

    /* JADX INFO: renamed from: j */
    public final void m45416j() {
        this.f29176a.setBackgroundResource(z2c0.f201210r);
        this.f29177b.setBackgroundResource(CoreModule.f17545c.f19639e0.m169520na().isFemale() ? z2c0.f201212t : z2c0.f201211s);
        this.f29178c.setText("只看真实头像用户");
        this.f29179d.setText("让配对更加真实！");
        this.f29180e.setTextColor(Color.parseColor("#10acfe"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45412e(this);
    }

    public FreeTrialCard(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FreeTrialCard(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
