package com.p051p1.mobile.putong.core.p058ui.freetrial;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import org.jetbrains.annotations.NotNull;
import p153l.fbc0;
import p153l.v8j;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
public class FreeTrialCard extends CardView {

    /* JADX INFO: renamed from: a */
    public View f30024a;

    /* JADX INFO: renamed from: b */
    public ImageView f30025b;

    /* JADX INFO: renamed from: c */
    public TextView f30026c;

    /* JADX INFO: renamed from: d */
    public TextView f30027d;

    /* JADX INFO: renamed from: e */
    public TextView f30028e;

    /* JADX INFO: renamed from: f */
    public TextView f30029f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.freetrial.FreeTrialCard$a */
    public static /* synthetic */ class C8497a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30030a;

        static {
            int[] iArr = new int[VirtualCardType.values().length];
            f30030a = iArr;
            try {
                iArr[VirtualCardType.FreeTrialRealUser.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30030a[VirtualCardType.FreeTrialOnline.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f30030a[VirtualCardType.FreeTrialPopular.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public FreeTrialCard(@NonNull @NotNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m46595e(View view) {
        v8j.m200307a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m46596f(VirtualCardType virtualCardType, final x20 x20Var) {
        int i = C8497a.f30030a[virtualCardType.ordinal()];
        if (i == 1) {
            m46599j();
        } else if (i == 2) {
            m46597h();
        } else if (i == 3) {
            m46598i();
        }
        this.f30028e.setOnClickListener(new View.OnClickListener() { // from class: l.p8j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                x20Var.call();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final void m46597h() {
        this.f30024a.setBackgroundResource(fbc0.f98073l);
        this.f30025b.setBackgroundResource(CoreModule.f18264c.f20381e0.m116593na().isFemale() ? fbc0.f98075n : fbc0.f98074m);
        this.f30026c.setText("优先看在线用户");
        this.f30027d.setText("配对后即刻聊天！\n");
        this.f30028e.setTextColor(Color.parseColor("#00cf5f"));
    }

    /* JADX INFO: renamed from: i */
    public final void m46598i() {
        this.f30024a.setBackgroundResource(fbc0.f98076o);
        this.f30025b.setBackgroundResource(CoreModule.f18264c.f20381e0.m116593na().isFemale() ? fbc0.f98078q : fbc0.f98077p);
        this.f30026c.setText("优先看最受欢迎用户");
        this.f30027d.setText("遇见你的理想型！");
        this.f30028e.setTextColor(Color.parseColor("#ffc014"));
    }

    /* JADX INFO: renamed from: j */
    public final void m46599j() {
        this.f30024a.setBackgroundResource(fbc0.f98079r);
        this.f30025b.setBackgroundResource(CoreModule.f18264c.f20381e0.m116593na().isFemale() ? fbc0.f98081t : fbc0.f98080s);
        this.f30026c.setText("只看真实头像用户");
        this.f30027d.setText("让配对更加真实！");
        this.f30028e.setTextColor(Color.parseColor("#10acfe"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46595e(this);
    }

    public FreeTrialCard(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FreeTrialCard(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
