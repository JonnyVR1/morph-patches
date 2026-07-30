package com.p000p1.mobile.putong.core.p001ui.freetrial;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.CoreModule;
import l.d30;
import l.z2c0;
import org.jetbrains.annotations.NotNull;
import p003l.b6j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class FreeTrialCard extends CardView {

    /* JADX INFO: renamed from: a */
    public View f1570a;

    /* JADX INFO: renamed from: b */
    public ImageView f1571b;

    /* JADX INFO: renamed from: c */
    public TextView f1572c;

    /* JADX INFO: renamed from: d */
    public TextView f1573d;

    /* JADX INFO: renamed from: e */
    public TextView f1574e;

    /* JADX INFO: renamed from: f */
    public TextView f1575f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.freetrial.FreeTrialCard$a */
    public static /* synthetic */ class C3109a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1576a;

        static {
            int[] iArr = new int[VirtualCardType.values().length];
            f1576a = iArr;
            try {
                iArr[VirtualCardType.FreeTrialRealUser.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1576a[VirtualCardType.FreeTrialOnline.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1576a[VirtualCardType.FreeTrialPopular.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public FreeTrialCard(@NonNull @NotNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m2739e(View view) {
        b6j.m5695a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m2740f(VirtualCardType virtualCardType, final d30 d30Var) {
        int i = C3109a.f1576a[virtualCardType.ordinal()];
        if (i == 1) {
            m2743j();
        } else if (i == 2) {
            m2741h();
        } else if (i == 3) {
            m2742i();
        }
        this.f1574e.setOnClickListener(new View.OnClickListener() { // from class: l.v5j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                d30Var.call();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m2741h() {
        this.f1570a.setBackgroundResource(z2c0.l);
        this.f1571b.setBackgroundResource(CoreModule.c.e0.na().isFemale() ? z2c0.n : z2c0.m);
        this.f1572c.setText("优先看在线用户");
        this.f1573d.setText("配对后即刻聊天！\n");
        this.f1574e.setTextColor(Color.parseColor("#00cf5f"));
    }

    /* JADX INFO: renamed from: i */
    public final void m2742i() {
        this.f1570a.setBackgroundResource(z2c0.o);
        this.f1571b.setBackgroundResource(CoreModule.c.e0.na().isFemale() ? z2c0.q : z2c0.p);
        this.f1572c.setText("优先看最受欢迎用户");
        this.f1573d.setText("遇见你的理想型！");
        this.f1574e.setTextColor(Color.parseColor("#ffc014"));
    }

    /* JADX INFO: renamed from: j */
    public final void m2743j() {
        this.f1570a.setBackgroundResource(z2c0.r);
        this.f1571b.setBackgroundResource(CoreModule.c.e0.na().isFemale() ? z2c0.t : z2c0.s);
        this.f1572c.setText("只看真实头像用户");
        this.f1573d.setText("让配对更加真实！");
        this.f1574e.setTextColor(Color.parseColor("#10acfe"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2739e(this);
    }

    public FreeTrialCard(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FreeTrialCard(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
