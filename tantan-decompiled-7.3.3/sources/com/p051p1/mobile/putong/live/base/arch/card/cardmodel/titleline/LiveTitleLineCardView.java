package com.p051p1.mobile.putong.live.base.arch.card.cardmodel.titleline;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.apibean.LiveCardTracker;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.ceu;
import p153l.hk4;
import p153l.izs;
import p153l.jdc0;
import p153l.l9c0;
import p153l.mbc0;
import p153l.n3d0;
import p153l.yrs;

/* JADX INFO: loaded from: classes13.dex */
public class LiveTitleLineCardView extends LinearLayout {
    private View contentContainer;
    private VDraweeView image;
    private TextView text;
    private TextView titleView;

    public LiveTitleLineCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ void m68696b(ceu ceuVar, View view) {
        yrs.m217233a(getContext(), ceuVar.m109455a());
        LiveCardTracker.trackMc(ceuVar.m109460f());
    }

    /* JADX INFO: renamed from: c */
    public void m68697c(hk4 hk4Var, final ceu ceuVar) {
        String str;
        if (hk4Var.m135616b()) {
            this.titleView.setTextColor(n3d0.m161277a(l9c0.f130591d));
            this.text.setTextColor(n3d0.m161277a(l9c0.f130591d));
            this.contentContainer.setBackgroundResource(mbc0.f135710w);
        }
        if (TextUtils.isEmpty(ceuVar.m109457c())) {
            str = "";
        } else {
            str = "·" + ceuVar.m109457c();
        }
        this.titleView.setText(ceuVar.m109459e() + str);
        if (TextUtils.isEmpty(ceuVar.m109456b()) || TextUtils.isEmpty(ceuVar.m109458d())) {
            bnl0.m105524M(this.contentContainer, false);
            this.image.setOnClickListener(null);
        } else {
            bnl0.m105524M(this.contentContainer, true);
            izs.m142868s("context_square", this.image, ceuVar.m109456b());
            this.text.setText(ceuVar.m109458d());
            bnl0.m105509E0(this.image, new View.OnClickListener() { // from class: l.deu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f88086a.m68696b(ceuVar, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(jdc0.f120175Z0);
        this.titleView = textView;
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        this.contentContainer = findViewById(jdc0.f120124A);
        this.image = (VDraweeView) findViewById(jdc0.f120158R);
        this.text = (TextView) findViewById(jdc0.f120126B);
    }

    public LiveTitleLineCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveTitleLineCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
