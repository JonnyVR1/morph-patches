package com.p051p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.newui.loveletter.LoveLetterEmptyLayout;
import com.p051p1.mobile.putong.data.NavigationIntent;
import p151v.AutoVDraweeView;
import p153l.adc0;
import p153l.bnl0;
import p153l.few;
import p153l.qa00;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterEmptyLayout extends LinearLayout {
    public LoveLetterEmptyLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m40592a(few fewVar, View view) {
        fewVar.act().startActivity(uqb0.f180396b0.f170325b.toNewMainAct(fewVar.act(), NavigationIntent.get("cards")));
        fewVar.act().m68056e2();
    }

    /* JADX INFO: renamed from: b */
    public void m40593b(final few fewVar) {
        int iM105588w0 = ((bnl0.m105588w0() - bnl0.m105511F0()) - qa00.m175859d(480.0f)) - qa00.m175859d(30.0f);
        AutoVDraweeView autoVDraweeView = (AutoVDraweeView) findViewById(adc0.f69808A3);
        autoVDraweeView.m224133x("https://auto.tancdn.com/v1/images/eyJpZCI6IkY2SU9MNVo0RkRHNFREWFkzNklTS1dKUk8zNEZNSTE0IiwidyI6Mjg4LCJoIjoyODgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjozNDM1OTczODM2OH0.png", 1);
        if (iM105588w0 > qa00.m175859d(208.0f)) {
            bnl0.m105505C0(this, iM105588w0);
            bnl0.m105540X(autoVDraweeView, ((iM105588w0 - qa00.m175859d(218.0f)) / 2) + qa00.m175859d(18.0f));
        }
        View viewFindViewById = findViewById(adc0.f70619w3);
        if (viewFindViewById != null) {
            bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.wcw
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LoveLetterEmptyLayout.m40592a(fewVar, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
    }

    public LoveLetterEmptyLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LoveLetterEmptyLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
