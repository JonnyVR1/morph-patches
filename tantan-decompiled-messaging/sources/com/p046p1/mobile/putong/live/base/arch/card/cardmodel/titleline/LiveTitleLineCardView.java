package com.p046p1.mobile.putong.live.base.arch.card.cardmodel.titleline;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.base.apibean.LiveCardTracker;
import p147v.VDraweeView;
import p149l.bcu;
import p149l.d5c0;
import p149l.f1c0;
import p149l.g3c0;
import p149l.hxs;
import p149l.ij4;
import p149l.kvc0;
import p149l.xdl0;
import p149l.xps;

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
    public final /* synthetic */ void m67513b(bcu bcuVar, View view) {
        xps.m210534a(getContext(), bcuVar.m101125a());
        LiveCardTracker.trackMc(bcuVar.m101130f());
    }

    /* JADX INFO: renamed from: c */
    public void m67514c(ij4 ij4Var, final bcu bcuVar) {
        String str;
        if (ij4Var.m136505b()) {
            this.titleView.setTextColor(kvc0.m147352a(f1c0.f94067d));
            this.text.setTextColor(kvc0.m147352a(f1c0.f94067d));
            this.contentContainer.setBackgroundResource(g3c0.f100448w);
        }
        if (TextUtils.isEmpty(bcuVar.m101127c())) {
            str = "";
        } else {
            str = "·" + bcuVar.m101127c();
        }
        this.titleView.setText(bcuVar.m101129e() + str);
        if (TextUtils.isEmpty(bcuVar.m101126b()) || TextUtils.isEmpty(bcuVar.m101128d())) {
            xdl0.m208344M(this.contentContainer, false);
            this.image.setOnClickListener(null);
        } else {
            xdl0.m208344M(this.contentContainer, true);
            hxs.m133406s("context_square", this.image, bcuVar.m101126b());
            this.text.setText(bcuVar.m101128d());
            xdl0.m208329E0(this.image, new View.OnClickListener() { // from class: l.ccu
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f80302a.m67513b(bcuVar, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(d5c0.f84457Z0);
        this.titleView = textView;
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        this.contentContainer = findViewById(d5c0.f84406A);
        this.image = (VDraweeView) findViewById(d5c0.f84440R);
        this.text = (TextView) findViewById(d5c0.f84408B);
    }

    public LiveTitleLineCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveTitleLineCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
