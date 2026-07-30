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

/* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.a */
/* JADX INFO: loaded from: classes.dex */
class C1305a extends C1308d {

    /* JADX INFO: renamed from: r */
    private final TextView f5334r;

    /* JADX INFO: renamed from: s */
    private final RelativeLayout f5335s;

    /* JADX INFO: renamed from: t */
    private final CTCarouselViewPager f5336t;

    /* JADX INFO: renamed from: u */
    private final LinearLayout f5337u;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.a$a */
    public class a implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: a */
        private final Context f5338a;

        /* JADX INFO: renamed from: b */
        private final ImageView[] f5339b;

        /* JADX INFO: renamed from: c */
        private final CTInboxMessage f5340c;

        /* JADX INFO: renamed from: d */
        private final C1305a f5341d;

        public a(Context context, C1305a c1305a, ImageView[] imageViewArr, CTInboxMessage cTInboxMessage) {
            this.f5338a = context;
            this.f5341d = c1305a;
            this.f5339b = imageViewArr;
            this.f5340c = cTInboxMessage;
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
            for (ImageView imageView : this.f5339b) {
                imageView.setImageDrawable(c5d0.m108035e(this.f5338a.getResources(), wbc0.f188241n, null));
            }
            this.f5339b[i].setImageDrawable(c5d0.m108035e(this.f5338a.getResources(), wbc0.f188240m, null));
        }
    }

    public C1305a(@NonNull View view) {
        super(view);
        this.f5336t = (CTCarouselViewPager) view.findViewById(icc0.f114356e0);
        this.f5337u = (LinearLayout) view.findViewById(icc0.f114325L0);
        this.f5334r = (TextView) view.findViewById(icc0.f114351c);
        this.f5335s = (RelativeLayout) view.findViewById(icc0.f114349b);
    }

    @Override // com.clevertap.android.sdk.inbox.C1308d
    /* JADX INFO: renamed from: f */
    public void mo6788f(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i) {
        super.mo6788f(cTInboxMessage, cTInboxListViewFragment, i);
        CTInboxListViewFragment cTInboxListViewFragmentM6799i = m6799i();
        Context applicationContext = cTInboxListViewFragment.getActivity().getApplicationContext();
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.m6736d().get(0);
        this.f5334r.setVisibility(0);
        boolean zM6742k = cTInboxMessage.m6742k();
        ImageView imageView = this.f5379q;
        if (zM6742k) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        this.f5334r.setText(m6797e(cTInboxMessage.m6735c()));
        this.f5334r.setTextColor(Color.parseColor(cTInboxMessageContent.m6766t()));
        this.f5335s.setBackgroundColor(Color.parseColor(cTInboxMessage.m6733a()));
        this.f5336t.setAdapter(new nu3(applicationContext, cTInboxListViewFragment, cTInboxMessage, (LinearLayout.LayoutParams) this.f5336t.getLayoutParams(), i));
        int size = cTInboxMessage.m6736d().size();
        if (this.f5337u.getChildCount() > 0) {
            this.f5337u.removeAllViews();
        }
        ImageView[] imageViewArr = new ImageView[size];
        m6807q(imageViewArr, size, applicationContext, this.f5337u);
        imageViewArr[0].setImageDrawable(c5d0.m108035e(applicationContext.getResources(), wbc0.f188240m, null));
        this.f5336t.m4187d(new a(cTInboxListViewFragment.getActivity().getApplicationContext(), this, imageViewArr, cTInboxMessage));
        this.f5335s.setOnClickListener(new ViewOnClickListenerC1309e(i, cTInboxMessage, (String) null, cTInboxListViewFragmentM6799i, (ViewPager) this.f5336t, true, -1));
        m6802l(cTInboxMessage, i);
    }
}
