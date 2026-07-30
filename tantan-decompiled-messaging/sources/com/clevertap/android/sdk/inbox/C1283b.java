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

/* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.b */
/* JADX INFO: loaded from: classes.dex */
class C1283b extends C1285d {

    /* JADX INFO: renamed from: r */
    private final RelativeLayout f5306r;

    /* JADX INFO: renamed from: s */
    private final CTCarouselViewPager f5307s;

    /* JADX INFO: renamed from: t */
    private final LinearLayout f5308t;

    /* JADX INFO: renamed from: u */
    private final TextView f5309u;

    /* JADX INFO: renamed from: v */
    private final TextView f5310v;

    /* JADX INFO: renamed from: w */
    private final TextView f5311w;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.inbox.b$a */
    public class a implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: a */
        private final Context f5312a;

        /* JADX INFO: renamed from: b */
        private final ImageView[] f5313b;

        /* JADX INFO: renamed from: c */
        private final CTInboxMessage f5314c;

        /* JADX INFO: renamed from: d */
        private final C1283b f5315d;

        public a(Context context, C1283b c1283b, ImageView[] imageViewArr, CTInboxMessage cTInboxMessage) {
            this.f5312a = context;
            this.f5315d = c1283b;
            this.f5313b = imageViewArr;
            this.f5314c = cTInboxMessage;
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
            for (ImageView imageView : this.f5313b) {
                imageView.setImageDrawable(ywc0.m216334e(this.f5312a.getResources(), q3c0.f152413n, null));
            }
            this.f5313b[i].setImageDrawable(ywc0.m216334e(this.f5312a.getResources(), q3c0.f152412m, null));
            this.f5315d.f5309u.setText(this.f5314c.m6682d().get(i).m6711s());
            this.f5315d.f5309u.setTextColor(Color.parseColor(this.f5314c.m6682d().get(i).m6712t()));
            this.f5315d.f5310v.setText(this.f5314c.m6682d().get(i).m6708p());
            this.f5315d.f5310v.setTextColor(Color.parseColor(this.f5314c.m6682d().get(i).m6709q()));
        }
    }

    public C1283b(@NonNull View view) {
        super(view);
        this.f5307s = (CTCarouselViewPager) view.findViewById(c4c0.f79220e0);
        this.f5308t = (LinearLayout) view.findViewById(c4c0.f79189L0);
        this.f5309u = (TextView) view.findViewById(c4c0.f79177F0);
        this.f5310v = (TextView) view.findViewById(c4c0.f79175E0);
        this.f5311w = (TextView) view.findViewById(c4c0.f79197P0);
        this.f5306r = (RelativeLayout) view.findViewById(c4c0.f79213b);
    }

    @Override // com.clevertap.android.sdk.inbox.C1285d
    /* JADX INFO: renamed from: f */
    public void mo6734f(CTInboxMessage cTInboxMessage, CTInboxListViewFragment cTInboxListViewFragment, int i) {
        super.mo6734f(cTInboxMessage, cTInboxListViewFragment, i);
        CTInboxListViewFragment cTInboxListViewFragmentM6745i = m6745i();
        Context applicationContext = cTInboxListViewFragment.getActivity().getApplicationContext();
        CTInboxMessageContent cTInboxMessageContent = cTInboxMessage.m6682d().get(0);
        this.f5309u.setVisibility(0);
        this.f5310v.setVisibility(0);
        this.f5309u.setText(cTInboxMessageContent.m6711s());
        this.f5309u.setTextColor(Color.parseColor(cTInboxMessageContent.m6712t()));
        this.f5310v.setText(cTInboxMessageContent.m6708p());
        this.f5310v.setTextColor(Color.parseColor(cTInboxMessageContent.m6709q()));
        boolean zM6688k = cTInboxMessage.m6688k();
        ImageView imageView = this.f5342q;
        if (zM6688k) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        this.f5311w.setVisibility(0);
        this.f5311w.setText(m6743e(cTInboxMessage.m6681c()));
        this.f5311w.setTextColor(Color.parseColor(cTInboxMessageContent.m6712t()));
        this.f5306r.setBackgroundColor(Color.parseColor(cTInboxMessage.m6679a()));
        this.f5307s.setAdapter(new ot3(applicationContext, cTInboxListViewFragment, cTInboxMessage, (LinearLayout.LayoutParams) this.f5307s.getLayoutParams(), i));
        int size = cTInboxMessage.m6682d().size();
        if (this.f5308t.getChildCount() > 0) {
            this.f5308t.removeAllViews();
        }
        ImageView[] imageViewArr = new ImageView[size];
        m6753q(imageViewArr, size, applicationContext, this.f5308t);
        imageViewArr[0].setImageDrawable(ywc0.m216334e(applicationContext.getResources(), q3c0.f152412m, null));
        this.f5307s.m4185d(new a(cTInboxListViewFragment.getActivity().getApplicationContext(), this, imageViewArr, cTInboxMessage));
        this.f5306r.setOnClickListener(new ViewOnClickListenerC1286e(i, cTInboxMessage, (String) null, cTInboxListViewFragmentM6745i, (ViewPager) this.f5307s, true, -1));
        m6748l(cTInboxMessage, i);
    }
}
