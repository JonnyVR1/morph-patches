package com.p000p1.mobile.putong.core.p001ui.home.view;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.VText_Bold;
import l.j2e0;
import l.qib0;
import l.xdl0;
import p003l.ivw;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class MarryAdCardView extends CardView {

    /* JADX INFO: renamed from: a */
    public VDraweeView f2111a;

    /* JADX INFO: renamed from: b */
    public SimpleDraweeView f2112b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f2113c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f2114d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f2115e;

    public MarryAdCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m3470f(View view) {
        CoreModule.c.m0.C8("marryGuideClick");
        j2e0.m(getContext(), Uri.parse("tantan://marriageGuide"));
    }

    /* JADX INFO: renamed from: e */
    public final void m3471e(View view) {
        ivw.m7301a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m3472h() {
        String str;
        String str2;
        qib0.G.L0(this.f2111a, "https://auto.tancdn.com/v1/images/eyJpZCI6IlJRREhHUkdCNjZEU01JNzdVV0xDRzVJQ1BZUFIyVTE0IiwidyI6NzE4LCJoIjoxMjAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTA0Njg0NjM3MDEzNDM1NDkyfQ.png");
        if (CoreModule.c.e0.na().isFemale()) {
            str = "JOJO 27";
            str2 = "https://auto.tancdn.com/v1/images/eyJpZCI6IlJDSlFTVVNCWlROVjVDSVdZS0xLQldWRzNOT0VQTzE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTkxMDU4OTA2OTkyMDY4NzcyOX0.png";
        } else {
            str = "桃子 25";
            str2 = "https://auto.tancdn.com/v1/images/eyJpZCI6IkVBUERJVE9NT0o0Sk5ZNlJUVlA0UjRXSU1XSk03RjE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjQ2NjAzMTQ0OTY1NDM0NzA3fQ.png";
        }
        this.f2113c.setText("北京海淀 · 教师");
        this.f2114d.setText(str);
        qib0.G.L0(this.f2112b, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3471e(this);
        xdl0.E0(this.f2115e, new View.OnClickListener() { // from class: l.hvw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4960a.m3470f(view);
            }
        });
    }

    public MarryAdCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MarryAdCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
