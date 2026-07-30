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
import p149l.c4c0;
import p149l.ot3;
import p149l.q3c0;
import p149l.ywc0;

/* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.a */
/* JADX INFO: loaded from: classes.dex */
class C1282a extends C1285d {

    /* JADX INFO: renamed from: r */
    private final TextView f5297r;

    /* JADX INFO: renamed from: s */
    private final RelativeLayout f5298s;

    /* JADX INFO: renamed from: t */
    private final CTCarouselViewPager f5299t;

    /* JADX INFO: renamed from: u */
    private final LinearLayout f5300u;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.a$a */
    public class a implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: a */
        private final Context f5301a;

        /* JADX INFO: renamed from: b */
        private final ImageView[] f5302b;

        /* JADX INFO: renamed from: c */
        private final CTInboxMessage f5303c;

        /* JADX INFO: renamed from: d */
        private final C1282a f5304d;

        public a(Context context, C1282a c1282a, ImageView[] imageViewArr, CTInboxMessage cTInboxMessage) {
            this.f5301a = context;
            this.f5304d = c1282a;
            this.f5302b = imageViewArr;
            this.f5303c = cTInboxMessage;
            imageViewArr[0].setImageDrawable(ywc0.m216334e(context.getResources(), q3c0.f152412m, null));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            for (ImageView imageView : this.f5302b) {
                imageView.setImageDrawable(ywc0.m216334e(this.f5301a.getResources(), q3c0.f152413n, null));
            }
            this.f5302b[i].setImageDrawable(ywc0.m216334e(this.f5301a.getResources(), q3c0.f152412m, null));
        }
    }

    public C1282a(@NonNull View view) {
        super(view);
        this.f5299t = (CTCarouselViewPager) view.findViewById(c4c0.f79220e0);
        this.f5300u = (LinearLayout) view.findViewById(c4c0.f79189L0);
        this.f5297r = (TextView) view.findViewById(c4c0.f79215c);
        this.f5298s = (RelativeLayout) view.findViewById(c4c0.f79213b);
    }

    @Override // com.clevertap.android.sdk.inbox.C1285d
    /* JADX INFO: renamed from: f */
    public void mo6734f(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i) {
        super.mo6734f(cTInboxMessage, cTInboxListViewFragment, i);
        CTInboxListViewFragment cTInboxListViewFragmentM6745i = m6745i();
        Context applicationContext = cTInboxListViewFragment.getActivity().getApplicationContext();
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.m6682d().get(0);
        this.f5297r.setVisibility(0);
        boolean zM6688k = cTInboxMessage.m6688k();
        ImageView imageView = this.f5342q;
        if (zM6688k) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        this.f5297r.setText(m6743e(cTInboxMessage.m6681c()));
        this.f5297r.setTextColor(Color.parseColor(cTInboxMessageContent.m6712t()));
        this.f5298s.setBackgroundColor(Color.parseColor(cTInboxMessage.m6679a()));
        this.f5299t.setAdapter(new ot3(applicationContext, cTInboxListViewFragment, cTInboxMessage, (LinearLayout.LayoutParams) this.f5299t.getLayoutParams(), i));
        int size = cTInboxMessage.m6682d().size();
        if (this.f5300u.getChildCount() > 0) {
            this.f5300u.removeAllViews();
        }
        ImageView[] imageViewArr = new ImageView[size];
        m6753q(imageViewArr, size, applicationContext, this.f5300u);
        imageViewArr[0].setImageDrawable(ywc0.m216334e(applicationContext.getResources(), q3c0.f152412m, null));
        this.f5299t.m4185d(new a(cTInboxListViewFragment.getActivity().getApplicationContext(), this, imageViewArr, cTInboxMessage));
        this.f5298s.setOnClickListener(new ViewOnClickListenerC1286e(i, cTInboxMessage, (String) null, cTInboxListViewFragmentM6745i, (ViewPager) this.f5299t, true, -1));
        m6748l(cTInboxMessage, i);
    }
}
