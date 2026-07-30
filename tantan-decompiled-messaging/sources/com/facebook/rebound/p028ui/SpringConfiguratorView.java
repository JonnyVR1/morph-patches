package com.facebook.rebound.p028ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TableLayout;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.jqf0;
import p149l.lqf0;
import p149l.mqf0;
import p149l.uck0;
import p149l.wx50;
import p149l.xqf0;
import p149l.zqf0;

/* JADX INFO: loaded from: classes6.dex */
public class SpringConfiguratorView extends FrameLayout {

    /* JADX INFO: renamed from: n */
    public static final DecimalFormat f6841n = new DecimalFormat("#.#");

    /* JADX INFO: renamed from: a */
    public final C1716e f6842a;

    /* JADX INFO: renamed from: b */
    public final List<lqf0> f6843b;

    /* JADX INFO: renamed from: c */
    public final jqf0 f6844c;

    /* JADX INFO: renamed from: d */
    public final float f6845d;

    /* JADX INFO: renamed from: e */
    public final float f6846e;

    /* JADX INFO: renamed from: f */
    public final mqf0 f6847f;

    /* JADX INFO: renamed from: g */
    public final int f6848g;

    /* JADX INFO: renamed from: h */
    public SeekBar f6849h;

    /* JADX INFO: renamed from: i */
    public SeekBar f6850i;

    /* JADX INFO: renamed from: j */
    public Spinner f6851j;

    /* JADX INFO: renamed from: k */
    public TextView f6852k;

    /* JADX INFO: renamed from: l */
    public TextView f6853l;

    /* JADX INFO: renamed from: m */
    public lqf0 f6854m;

    /* JADX INFO: renamed from: com.facebook.rebound.ui.SpringConfiguratorView$b */
    public class ViewOnTouchListenerC1713b implements View.OnTouchListener {
        public ViewOnTouchListenerC1713b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return true;
            }
            SpringConfiguratorView.this.m9238p();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.facebook.rebound.ui.SpringConfiguratorView$d */
    public class C1715d implements SeekBar.OnSeekBarChangeListener {
        public C1715d() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (seekBar == SpringConfiguratorView.this.f6849h) {
                double d = ((i * 200.0f) / 100000.0f) + 0.0f;
                SpringConfiguratorView.this.f6854m.f129335b = wx50.m205900d(d);
                String str = SpringConfiguratorView.f6841n.format(d);
                SpringConfiguratorView.this.f6853l.setText("T:" + str);
            }
            if (seekBar == SpringConfiguratorView.this.f6850i) {
                double d2 = ((i * 50.0f) / 100000.0f) + 0.0f;
                SpringConfiguratorView.this.f6854m.f129334a = wx50.m205897a(d2);
                String str2 = SpringConfiguratorView.f6841n.format(d2);
                SpringConfiguratorView.this.f6852k.setText("F:" + str2);
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: renamed from: com.facebook.rebound.ui.SpringConfiguratorView$e */
    public class C1716e extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public final Context f6858a;

        /* JADX INFO: renamed from: b */
        public final List<String> f6859b = new ArrayList();

        public C1716e(Context context) {
            this.f6858a = context;
        }

        /* JADX INFO: renamed from: a */
        public void m9244a(String str) {
            this.f6859b.add(str);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: b */
        public void m9245b() {
            this.f6859b.clear();
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f6859b.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f6859b.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView textView;
            if (view == null) {
                textView = new TextView(this.f6858a);
                textView.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
                int iM193085d = uck0.m193085d(12.0f, SpringConfiguratorView.this.getResources());
                textView.setPadding(iM193085d, iM193085d, iM193085d, iM193085d);
                textView.setTextColor(SpringConfiguratorView.this.f6848g);
            } else {
                textView = (TextView) view;
            }
            textView.setText(this.f6859b.get(i));
            return textView;
        }
    }

    /* JADX INFO: renamed from: com.facebook.rebound.ui.SpringConfiguratorView$f */
    public class C1717f implements AdapterView.OnItemSelectedListener {
        public C1717f() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SpringConfiguratorView springConfiguratorView = SpringConfiguratorView.this;
            springConfiguratorView.f6854m = (lqf0) springConfiguratorView.f6843b.get(i);
            SpringConfiguratorView springConfiguratorView2 = SpringConfiguratorView.this;
            springConfiguratorView2.m9239q(springConfiguratorView2.f6854m);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @TargetApi(11)
    public SpringConfiguratorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6843b = new ArrayList();
        this.f6848g = Color.argb(255, 225, 225, 225);
        zqf0 zqf0VarM219852h = zqf0.m219852h();
        this.f6847f = mqf0.m155889c();
        C1716e c1716e = new C1716e(context);
        this.f6842a = c1716e;
        Resources resources = getResources();
        this.f6846e = uck0.m193085d(40.0f, resources);
        float fM193085d = uck0.m193085d(280.0f, resources);
        this.f6845d = fM193085d;
        jqf0 jqf0VarM108322c = zqf0VarM219852h.m108322c();
        this.f6844c = jqf0VarM108322c;
        jqf0VarM108322c.m142802m(1.0d).m142804o(1.0d).m142790a(new C1714c());
        addView(m9236n(context));
        C1715d c1715d = new C1715d();
        this.f6849h.setMax(LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY);
        this.f6849h.setOnSeekBarChangeListener(c1715d);
        this.f6850i.setMax(LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY);
        this.f6850i.setOnSeekBarChangeListener(c1715d);
        this.f6851j.setAdapter((SpinnerAdapter) c1716e);
        this.f6851j.setOnItemSelectedListener(new C1717f());
        m9237o();
        setTranslationY(fM193085d);
    }

    /* JADX INFO: renamed from: n */
    public final View m9236n(Context context) {
        Resources resources = getResources();
        int iM193085d = uck0.m193085d(5.0f, resources);
        int iM193085d2 = uck0.m193085d(10.0f, resources);
        int iM193085d3 = uck0.m193085d(20.0f, resources);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(0, 0, iM193085d, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(uck0.m193082a(-1, uck0.m193085d(300.0f, resources)));
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParamsM193083b = uck0.m193083b();
        layoutParamsM193083b.setMargins(0, iM193085d3, 0, 0);
        frameLayout2.setLayoutParams(layoutParamsM193083b);
        frameLayout2.setBackgroundColor(Color.argb(100, 0, 0, 0));
        frameLayout.addView(frameLayout2);
        this.f6851j = new Spinner(context, 0);
        FrameLayout.LayoutParams layoutParamsM193084c = uck0.m193084c();
        layoutParamsM193084c.gravity = 48;
        layoutParamsM193084c.setMargins(iM193085d2, iM193085d2, iM193085d2, 0);
        this.f6851j.setLayoutParams(layoutParamsM193084c);
        frameLayout2.addView(this.f6851j);
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParamsM193084c2 = uck0.m193084c();
        layoutParamsM193084c2.setMargins(0, 0, 0, uck0.m193085d(80.0f, resources));
        layoutParamsM193084c2.gravity = 80;
        linearLayout.setLayoutParams(layoutParamsM193084c2);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParamsM193084c3 = uck0.m193084c();
        layoutParamsM193084c3.setMargins(iM193085d2, iM193085d2, iM193085d2, iM193085d3);
        linearLayout2.setPadding(iM193085d2, iM193085d2, iM193085d2, iM193085d2);
        linearLayout2.setLayoutParams(layoutParamsM193084c3);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2);
        SeekBar seekBar = new SeekBar(context);
        this.f6849h = seekBar;
        seekBar.setLayoutParams(layoutParams);
        linearLayout2.addView(this.f6849h);
        TextView textView = new TextView(getContext());
        this.f6853l = textView;
        textView.setTextColor(this.f6848g);
        FrameLayout.LayoutParams layoutParamsM193082a = uck0.m193082a(uck0.m193085d(50.0f, resources), -1);
        this.f6853l.setGravity(19);
        this.f6853l.setLayoutParams(layoutParamsM193082a);
        this.f6853l.setMaxLines(1);
        linearLayout2.addView(this.f6853l);
        LinearLayout linearLayout3 = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParamsM193084c4 = uck0.m193084c();
        layoutParamsM193084c4.setMargins(iM193085d2, iM193085d2, iM193085d2, iM193085d3);
        linearLayout3.setPadding(iM193085d2, iM193085d2, iM193085d2, iM193085d2);
        linearLayout3.setLayoutParams(layoutParamsM193084c4);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3);
        SeekBar seekBar2 = new SeekBar(context);
        this.f6850i = seekBar2;
        seekBar2.setLayoutParams(layoutParams);
        linearLayout3.addView(this.f6850i);
        TextView textView2 = new TextView(getContext());
        this.f6852k = textView2;
        textView2.setTextColor(this.f6848g);
        FrameLayout.LayoutParams layoutParamsM193082a2 = uck0.m193082a(uck0.m193085d(50.0f, resources), -1);
        this.f6852k.setGravity(19);
        this.f6852k.setLayoutParams(layoutParamsM193082a2);
        this.f6852k.setMaxLines(1);
        linearLayout3.addView(this.f6852k);
        View view = new View(context);
        FrameLayout.LayoutParams layoutParamsM193082a3 = uck0.m193082a(uck0.m193085d(60.0f, resources), uck0.m193085d(40.0f, resources));
        layoutParamsM193082a3.gravity = 49;
        view.setLayoutParams(layoutParamsM193082a3);
        view.setOnTouchListener(new ViewOnTouchListenerC1713b());
        view.setBackgroundColor(Color.argb(255, 0, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, 209));
        frameLayout.addView(view);
        return frameLayout;
    }

    /* JADX INFO: renamed from: o */
    public void m9237o() {
        Map<lqf0, String> mapM155891b = this.f6847f.m155891b();
        this.f6842a.m9245b();
        this.f6843b.clear();
        for (Map.Entry<lqf0, String> entry : mapM155891b.entrySet()) {
            if (entry.getKey() != lqf0.f129333c) {
                this.f6843b.add(entry.getKey());
                this.f6842a.m9244a(entry.getValue());
            }
        }
        this.f6843b.add(lqf0.f129333c);
        this.f6842a.m9244a(mapM155891b.get(lqf0.f129333c));
        this.f6842a.notifyDataSetChanged();
        if (this.f6843b.size() > 0) {
            this.f6851j.setSelection(0);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m9238p() {
        this.f6844c.m142804o(this.f6844c.m142795f() == 1.0d ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : 1.0d);
    }

    /* JADX INFO: renamed from: q */
    public final void m9239q(lqf0 lqf0Var) {
        int iRound = Math.round(((((float) wx50.m205899c(lqf0Var.f129335b)) - 0.0f) * 100000.0f) / 200.0f);
        int iRound2 = Math.round(((((float) wx50.m205898b(lqf0Var.f129334a)) - 0.0f) * 100000.0f) / 50.0f);
        this.f6849h.setProgress(iRound);
        this.f6850i.setProgress(iRound2);
    }

    /* JADX INFO: renamed from: com.facebook.rebound.ui.SpringConfiguratorView$c */
    public class C1714c implements xqf0 {
        public C1714c() {
        }

        @Override // p149l.xqf0
        /* JADX INFO: renamed from: c */
        public void mo9242c(jqf0 jqf0Var) {
            float fM142793d = (float) jqf0Var.m142793d();
            float f = SpringConfiguratorView.this.f6846e;
            SpringConfiguratorView.this.setTranslationY((fM142793d * (SpringConfiguratorView.this.f6845d - f)) + f);
        }

        @Override // p149l.xqf0
        /* JADX INFO: renamed from: a */
        public void mo9240a(jqf0 jqf0Var) {
        }

        @Override // p149l.xqf0
        /* JADX INFO: renamed from: b */
        public void mo9241b(jqf0 jqf0Var) {
        }

        @Override // p149l.xqf0
        /* JADX INFO: renamed from: d */
        public void mo9243d(jqf0 jqf0Var) {
        }
    }

    public SpringConfiguratorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpringConfiguratorView(Context context) {
        this(context, null);
    }
}
