package com.clevertap.android.sdk.inbox;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import p153l.c5d0;
import p153l.icc0;
import p153l.nu3;
import p153l.wbc0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.b */
/* JADX INFO: loaded from: classes.dex */
class C1306b extends C1308d {

    /* JADX INFO: renamed from: r */
    private final RelativeLayout f5343r;

    /* JADX INFO: renamed from: s */
    private final CTCarouselViewPager f5344s;

    /* JADX INFO: renamed from: t */
    private final LinearLayout f5345t;

    /* JADX INFO: renamed from: u */
    private final TextView f5346u;

    /* JADX INFO: renamed from: v */
    private final TextView f5347v;

    /* JADX INFO: renamed from: w */
    private final TextView f5348w;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.b$a */
    public class a implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: a */
        private final Context f5349a;

        /* JADX INFO: renamed from: b */
        private final ImageView[] f5350b;

        /* JADX INFO: renamed from: c */
        private final CTInboxMessage f5351c;

        /* JADX INFO: renamed from: d */
        private final C1306b f5352d;

        public a(Context context, C1306b c1306b, ImageView[] imageViewArr, CTInboxMessage cTInboxMessage) {
            this.f5349a = context;
            this.f5352d = c1306b;
            this.f5350b = imageViewArr;
            this.f5351c = cTInboxMessage;
            imageViewArr[0].setImageDrawable(c5d0.m108035e(context.getResources(), wbc0.f188240m, null));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            for (ImageView imageView : this.f5350b) {
                imageView.setImageDrawable(c5d0.m108035e(this.f5349a.getResources(), wbc0.f188241n, null));
            }
            this.f5350b[i].setImageDrawable(c5d0.m108035e(this.f5349a.getResources(), wbc0.f188240m, null));
            this.f5352d.f5346u.setText(this.f5351c.m6736d().get(i).m6765s());
            this.f5352d.f5346u.setTextColor(Color.parseColor(this.f5351c.m6736d().get(i).m6766t()));
            this.f5352d.f5347v.setText(this.f5351c.m6736d().get(i).m6762p());
            this.f5352d.f5347v.setTextColor(Color.parseColor(this.f5351c.m6736d().get(i).m6763q()));
        }
    }

    public C1306b(@NonNull View view) {
        super(view);
        this.f5344s = (CTCarouselViewPager) view.findViewById(icc0.f114356e0);
        this.f5345t = (LinearLayout) view.findViewById(icc0.f114325L0);
        this.f5346u = (TextView) view.findViewById(icc0.f114313F0);
        this.f5347v = (TextView) view.findViewById(icc0.f114311E0);
        this.f5348w = (TextView) view.findViewById(icc0.f114333P0);
        this.f5343r = (RelativeLayout) view.findViewById(icc0.f114349b);
    }

    @Override // com.clevertap.android.sdk.inbox.C1308d
    /* JADX INFO: renamed from: f */
    public void mo6788f(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i) {
        super.mo6788f(cTInboxMessage, cTInboxListViewFragment, i);
        CTInboxListViewFragment cTInboxListViewFragmentM6799i = m6799i();
        Context applicationContext = cTInboxListViewFragment.getActivity().getApplicationContext();
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.m6736d().get(0);
        this.f5346u.setVisibility(0);
        this.f5347v.setVisibility(0);
        this.f5346u.setText(cTInboxMessageContent.m6765s());
        this.f5346u.setTextColor(Color.parseColor(cTInboxMessageContent.m6766t()));
        this.f5347v.setText(cTInboxMessageContent.m6762p());
        this.f5347v.setTextColor(Color.parseColor(cTInboxMessageContent.m6763q()));
        boolean zM6742k = cTInboxMessage.m6742k();
        ImageView imageView = this.f5379q;
        if (zM6742k) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        this.f5348w.setVisibility(0);
        this.f5348w.setText(m6797e(cTInboxMessage.m6735c()));
        this.f5348w.setTextColor(Color.parseColor(cTInboxMessageContent.m6766t()));
        this.f5343r.setBackgroundColor(Color.parseColor(cTInboxMessage.m6733a()));
        this.f5344s.setAdapter(new nu3(applicationContext, cTInboxListViewFragment, cTInboxMessage, (LinearLayout.LayoutParams) this.f5344s.getLayoutParams(), i));
        int size = cTInboxMessage.m6736d().size();
        if (this.f5345t.getChildCount() > 0) {
            this.f5345t.removeAllViews();
        }
        ImageView[] imageViewArr = new ImageView[size];
        m6807q(imageViewArr, size, applicationContext, this.f5345t);
        imageViewArr[0].setImageDrawable(c5d0.m108035e(applicationContext.getResources(), wbc0.f188240m, null));
        this.f5344s.m4187d(new a(cTInboxListViewFragment.getActivity().getApplicationContext(), this, imageViewArr, cTInboxMessage));
        this.f5343r.setOnClickListener(new ViewOnClickListenerC1309e(i, cTInboxMessage, (String) null, cTInboxListViewFragmentM6799i, (ViewPager) this.f5344s, true, -1));
        m6802l(cTInboxMessage, i);
    }
}
