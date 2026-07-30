package com.p046p1.mobile.putong.core.p053ui.home.view;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import p147v.VDraweeView;
import p149l.ivw;
import p149l.j2e0;
import p149l.qib0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class MarryAdCardView extends CardView {

    /* JADX INFO: renamed from: a */
    public VDraweeView f29717a;

    /* JADX INFO: renamed from: b */
    public SimpleDraweeView f29718b;

    /* JADX INFO: renamed from: c */
    public VText_Bold f29719c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f29720d;

    /* JADX INFO: renamed from: e */
    public VText_Bold f29721e;

    public MarryAdCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m46105f(View view) {
        CoreModule.f17545c.f19663m0.m30986C8("marryGuideClick");
        j2e0.m139446m((Act) getContext(), Uri.parse("tantan://marriageGuide"));
    }

    /* JADX INFO: renamed from: e */
    public final void m46106e(View view) {
        ivw.m138667a(this, view);
    }

    /* JADX INFO: renamed from: h */
    public void m46107h() {
        String str;
        String str2;
        qib0.f154691G.m102331L0(this.f29717a, "https://auto.tancdn.com/v1/images/eyJpZCI6IlJRREhHUkdCNjZEU01JNzdVV0xDRzVJQ1BZUFIyVTE0IiwidyI6NzE4LCJoIjoxMjAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NTA0Njg0NjM3MDEzNDM1NDkyfQ.png");
        if (CoreModule.f17545c.f19639e0.m169520na().isFemale()) {
            str = "JOJO 27";
            str2 = "https://auto.tancdn.com/v1/images/eyJpZCI6IlJDSlFTVVNCWlROVjVDSVdZS0xLQldWRzNOT0VQTzE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNTkxMDU4OTA2OTkyMDY4NzcyOX0.png";
        } else {
            str = "桃子 25";
            str2 = "https://auto.tancdn.com/v1/images/eyJpZCI6IkVBUERJVE9NT0o0Sk5ZNlJUVlA0UjRXSU1XSk03RjE0IiwidyI6MzY2LCJoIjo1NDQsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoxNjQ2NjAzMTQ0OTY1NDM0NzA3fQ.png";
        }
        this.f29719c.setText("北京海淀 · 教师");
        this.f29720d.setText(str);
        qib0.f154691G.m102331L0(this.f29718b, str2);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46106e(this);
        xdl0.m208329E0(this.f29721e, new View.OnClickListener() { // from class: l.hvw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109703a.m46105f(view);
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
