package com.p051p1.mobile.putong.core.p058ui.home.view;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.hyw;
import p153l.nae0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class MarryAdCardView extends CardView {

    /* JADX INFO: renamed from: a */
    public VDraweeView f30565a;

    /* JADX INFO: renamed from: b */
    public SimpleDraweeView f30566b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f30567c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f30568d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f30569e;

    public MarryAdCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m47288f(View view) {
        CoreModule.f18264c.f20405m0.m31989C8("marryGuideClick");
        nae0.m162083m((Act) getContext(), Uri.parse("tantan://marriageGuide"));
    }

    /* JADX INFO: renamed from: e */
    public final void m47289e(View view) {
        hyw.m137784a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m47290h() {
        String str;
        String str2;
        uqb0.f180374G.m127115L0(this.f30565a, "https://auto.tancdn.com/v1/images/eyJpZCI6IlJRREhHUkdCNjZEU01JNzdVV0xDRzVJQ1BZUFIyVTE0IiwidyI6NzE4LCJoIjoxMjAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTA0Njg0NjM3MDEzNDM1NDkyfQ.png");
        if (CoreModule.f18264c.f20381e0.m116593na().isFemale()) {
            str = "JOJO 27";
            str2 = "https://auto.tancdn.com/v1/images/eyJpZCI6IlJDSlFTVVNCWlROVjVDSVdZS0xLQldWRzNOT0VQTzE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTkxMDU4OTA2OTkyMDY4NzcyOX0.png";
        } else {
            str = "桃子 25";
            str2 = "https://auto.tancdn.com/v1/images/eyJpZCI6IkVBUERJVE9NT0o0Sk5ZNlJUVlA0UjRXSU1XSk03RjE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjQ2NjAzMTQ0OTY1NDM0NzA3fQ.png";
        }
        this.f30567c.setText("北京海淀 · 教师");
        this.f30568d.setText(str);
        uqb0.f180374G.m127115L0(this.f30566b, str2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47289e(this);
        bnl0.m105509E0(this.f30569e, new View.OnClickListener() { // from class: l.gyw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107119a.m47288f(view);
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
