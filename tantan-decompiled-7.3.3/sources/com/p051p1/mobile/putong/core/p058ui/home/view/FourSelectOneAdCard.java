package com.p051p1.mobile.putong.core.p058ui.home.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.FourSelectOneAdCardData;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.e4j;
import p153l.jyb;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class FourSelectOneAdCard extends CardView {

    /* JADX INFO: renamed from: a */
    public VDraweeView f30556a;

    /* JADX INFO: renamed from: b */
    public VText_Bold f30557b;

    /* JADX INFO: renamed from: c */
    public VText f30558c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f30559d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f30560e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f30561f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f30562g;

    /* JADX INFO: renamed from: h */
    public VText_Bold f30563h;

    /* JADX INFO: renamed from: i */
    public VDraweeView[] f30564i;

    public FourSelectOneAdCard(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public final void m47285e(View view) {
        e4j.m119429a(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m47286f(int i) {
        CoreSuggested.UserInfo userInfo;
        FourSelectOneAdCardData fourSelectOneAdCardData;
        uqb0.f180374G.m127115L0(this.f30556a, "https://auto.tancdn.com/v1/images/eyJpZCI6IkJPQlZNTkVNRURFUzVIWlJUWUhaUUNYQlRJTTNBVTE0IiwidyI6NzE4LCJoIjoxMjAwLCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NzIwNTc1OTQwNTA1MjMxNjB9.png");
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        if (partialListOptM222761e == null || i >= partialListOptM222761e.loaded.size() || (fourSelectOneAdCardData = (userInfo = partialListOptM222761e.loaded.get(i)).fourSelectOneAdCardData) == null || jyb.m147479J(fourSelectOneAdCardData.avatarList)) {
            return;
        }
        this.f30557b.setText(userInfo.fourSelectOneAdCardData.adTitle);
        this.f30558c.setText(userInfo.fourSelectOneAdCardData.adContent);
        int iMin = Math.min(userInfo.fourSelectOneAdCardData.avatarList.size(), 4);
        for (int i2 = 0; i2 < iMin; i2++) {
            uqb0.f180374G.m127115L0(this.f30564i[i2], userInfo.fourSelectOneAdCardData.avatarList.get(i2));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47285e(this);
        this.f30564i = new VDraweeView[]{this.f30559d, this.f30560e, this.f30561f, this.f30562g};
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.c4j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.f18264c.f20405m0.f20088I2.onNext(pf60.m172085a(SwipeDirection.RIGHT, null));
            }
        });
    }

    public FourSelectOneAdCard(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FourSelectOneAdCard(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
