package com.facebook.rebound.p029ui;

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
import com.p051p1.mobile.putong.live.base.arch.card.cardmodel.videoFeed.LiveVideoFeedSmallStyleCardView;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.amk0;
import p153l.b660;
import p153l.gzf0;
import p153l.izf0;
import p153l.syf0;
import p153l.uyf0;
import p153l.vyf0;

/* JADX INFO: loaded from: classes6.dex */
public class SpringConfiguratorView extends FrameLayout {

    /* JADX INFO: renamed from: n */
    public static final DecimalFormat f6878n = new DecimalFormat("#.#");

    /* JADX INFO: renamed from: a */
    public final C1739e f6879a;

    /* JADX INFO: renamed from: b */
    public final List<uyf0> f6880b;

    /* JADX INFO: renamed from: c */
    public final syf0 f6881c;

    /* JADX INFO: renamed from: d */
    public final float f6882d;

    /* JADX INFO: renamed from: e */
    public final float f6883e;

    /* JADX INFO: renamed from: f */
    public final vyf0 f6884f;

    /* JADX INFO: renamed from: g */
    public final int f6885g;

    /* JADX INFO: renamed from: h */
    public SeekBar f6886h;

    /* JADX INFO: renamed from: i */
    public SeekBar f6887i;

    /* JADX INFO: renamed from: j */
    public Spinner f6888j;

    /* JADX INFO: renamed from: k */
    public TextView f6889k;

    /* JADX INFO: renamed from: l */
    public TextView f6890l;

    /* JADX INFO: renamed from: m */
    public uyf0 f6891m;

    /* JADX INFO: renamed from: com.facebook.rebound.ui.SpringConfiguratorView$b */
    public class ViewOnTouchListenerC1736b implements View.OnTouchListener {
        public ViewOnTouchListenerC1736b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                return true;
            }
            SpringConfiguratorView.this.m9292p();
            return true;
        }
    }

    /* JADX INFO: renamed from: com.facebook.rebound.ui.SpringConfiguratorView$d */
    public class C1738d implements SeekBar.OnSeekBarChangeListener {
        public C1738d() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (seekBar == SpringConfiguratorView.this.f6886h) {
                double d = ((i * 200.0f) / 100000.0f) + 0.0f;
                SpringConfiguratorView.this.f6891m.f181595b = b660.m102708d(d);
                String str = SpringConfiguratorView.f6878n.format(d);
                SpringConfiguratorView.this.f6890l.setText("T:" + str);
            }
            if (seekBar == SpringConfiguratorView.this.f6887i) {
                double d2 = ((i * 50.0f) / 100000.0f) + 0.0f;
                SpringConfiguratorView.this.f6891m.f181594a = b660.m102705a(d2);
                String str2 = SpringConfiguratorView.f6878n.format(d2);
                SpringConfiguratorView.this.f6889k.setText("F:" + str2);
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
    public class C1739e extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public final Context f6895a;

        /* JADX INFO: renamed from: b */
        public final List<String> f6896b = new ArrayList();

        public C1739e(Context context) {
            this.f6895a = context;
        }

        /* JADX INFO: renamed from: a */
        public void m9298a(String str) {
            this.f6896b.add(str);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: b */
        public void m9299b() {
            this.f6896b.clear();
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f6896b.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return this.f6896b.get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView textView;
            if (view == null) {
                textView = new TextView(this.f6895a);
                textView.setLayoutParams(new AbsListView.LayoutParams(-1, -1));
                int iM98847d = amk0.m98847d(12.0f, SpringConfiguratorView.this.getResources());
                textView.setPadding(iM98847d, iM98847d, iM98847d, iM98847d);
                textView.setTextColor(SpringConfiguratorView.this.f6885g);
            } else {
                textView = (TextView) view;
            }
            textView.setText(this.f6896b.get(i));
            return textView;
        }
    }

    /* JADX INFO: renamed from: com.facebook.rebound.ui.SpringConfiguratorView$f */
    public class C1740f implements AdapterView.OnItemSelectedListener {
        public C1740f() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            SpringConfiguratorView springConfiguratorView = SpringConfiguratorView.this;
            springConfiguratorView.f6891m = (uyf0) springConfiguratorView.f6880b.get(i);
            SpringConfiguratorView springConfiguratorView2 = SpringConfiguratorView.this;
            springConfiguratorView2.m9293q(springConfiguratorView2.f6891m);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @TargetApi(11)
    public SpringConfiguratorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6880b = new ArrayList();
        this.f6885g = Color.argb(255, 225, 225, 225);
        izf0 izf0VarM142800h = izf0.m142800h();
        this.f6884f = vyf0.m203993c();
        C1739e c1739e = new C1739e(context);
        this.f6879a = c1739e;
        Resources resources = getResources();
        this.f6883e = amk0.m98847d(40.0f, resources);
        float fM98847d = amk0.m98847d(280.0f, resources);
        this.f6882d = fM98847d;
        syf0 syf0VarM187585c = izf0VarM142800h.m187585c();
        this.f6881c = syf0VarM187585c;
        syf0VarM187585c.m188559m(1.0d).m188561o(1.0d).m188547a(new C1737c());
        addView(m9290n(context));
        C1738d c1738d = new C1738d();
        this.f6886h.setMax(LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY);
        this.f6886h.setOnSeekBarChangeListener(c1738d);
        this.f6887i.setMax(LiveVideoFeedSmallStyleCardView.DISTANCE_DIFFERENT_CITY);
        this.f6887i.setOnSeekBarChangeListener(c1738d);
        this.f6888j.setAdapter((SpinnerAdapter) c1739e);
        this.f6888j.setOnItemSelectedListener(new C1740f());
        m9291o();
        setTranslationY(fM98847d);
    }

    /* JADX INFO: renamed from: n */
    public final View m9290n(Context context) {
        Resources resources = getResources();
        int iM98847d = amk0.m98847d(5.0f, resources);
        int iM98847d2 = amk0.m98847d(10.0f, resources);
        int iM98847d3 = amk0.m98847d(20.0f, resources);
        TableLayout.LayoutParams layoutParams = new TableLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(0, 0, iM98847d, 0);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(amk0.m98844a(-1, amk0.m98847d(300.0f, resources)));
        FrameLayout frameLayout2 = new FrameLayout(context);
        FrameLayout.LayoutParams layoutParamsM98845b = amk0.m98845b();
        layoutParamsM98845b.setMargins(0, iM98847d3, 0, 0);
        frameLayout2.setLayoutParams(layoutParamsM98845b);
        frameLayout2.setBackgroundColor(Color.argb(100, 0, 0, 0));
        frameLayout.addView(frameLayout2);
        this.f6888j = new Spinner(context, 0);
        FrameLayout.LayoutParams layoutParamsM98846c = amk0.m98846c();
        layoutParamsM98846c.gravity = 48;
        layoutParamsM98846c.setMargins(iM98847d2, iM98847d2, iM98847d2, 0);
        this.f6888j.setLayoutParams(layoutParamsM98846c);
        frameLayout2.addView(this.f6888j);
        LinearLayout linearLayout = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParamsM98846c2 = amk0.m98846c();
        layoutParamsM98846c2.setMargins(0, 0, 0, amk0.m98847d(80.0f, resources));
        layoutParamsM98846c2.gravity = 80;
        linearLayout.setLayoutParams(layoutParamsM98846c2);
        linearLayout.setOrientation(1);
        frameLayout2.addView(linearLayout);
        LinearLayout linearLayout2 = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParamsM98846c3 = amk0.m98846c();
        layoutParamsM98846c3.setMargins(iM98847d2, iM98847d2, iM98847d2, iM98847d3);
        linearLayout2.setPadding(iM98847d2, iM98847d2, iM98847d2, iM98847d2);
        linearLayout2.setLayoutParams(layoutParamsM98846c3);
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2);
        SeekBar seekBar = new SeekBar(context);
        this.f6886h = seekBar;
        seekBar.setLayoutParams(layoutParams);
        linearLayout2.addView(this.f6886h);
        TextView textView = new TextView(getContext());
        this.f6890l = textView;
        textView.setTextColor(this.f6885g);
        FrameLayout.LayoutParams layoutParamsM98844a = amk0.m98844a(amk0.m98847d(50.0f, resources), -1);
        this.f6890l.setGravity(19);
        this.f6890l.setLayoutParams(layoutParamsM98844a);
        this.f6890l.setMaxLines(1);
        linearLayout2.addView(this.f6890l);
        LinearLayout linearLayout3 = new LinearLayout(context);
        FrameLayout.LayoutParams layoutParamsM98846c4 = amk0.m98846c();
        layoutParamsM98846c4.setMargins(iM98847d2, iM98847d2, iM98847d2, iM98847d3);
        linearLayout3.setPadding(iM98847d2, iM98847d2, iM98847d2, iM98847d2);
        linearLayout3.setLayoutParams(layoutParamsM98846c4);
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3);
        SeekBar seekBar2 = new SeekBar(context);
        this.f6887i = seekBar2;
        seekBar2.setLayoutParams(layoutParams);
        linearLayout3.addView(this.f6887i);
        TextView textView2 = new TextView(getContext());
        this.f6889k = textView2;
        textView2.setTextColor(this.f6885g);
        FrameLayout.LayoutParams layoutParamsM98844a2 = amk0.m98844a(amk0.m98847d(50.0f, resources), -1);
        this.f6889k.setGravity(19);
        this.f6889k.setLayoutParams(layoutParamsM98844a2);
        this.f6889k.setMaxLines(1);
        linearLayout3.addView(this.f6889k);
        View view = new View(context);
        FrameLayout.LayoutParams layoutParamsM98844a3 = amk0.m98844a(amk0.m98847d(60.0f, resources), amk0.m98847d(40.0f, resources));
        layoutParamsM98844a3.gravity = 49;
        view.setLayoutParams(layoutParamsM98844a3);
        view.setOnTouchListener(new ViewOnTouchListenerC1736b());
        view.setBackgroundColor(Color.argb(255, 0, CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256, 209));
        frameLayout.addView(view);
        return frameLayout;
    }

    /* JADX INFO: renamed from: o */
    public void m9291o() {
        Map<uyf0, String> mapM203995b = this.f6884f.m203995b();
        this.f6879a.m9299b();
        this.f6880b.clear();
        for (Map.Entry<uyf0, String> entry : mapM203995b.entrySet()) {
            if (entry.getKey() != uyf0.f181593c) {
                this.f6880b.add(entry.getKey());
                this.f6879a.m9298a(entry.getValue());
            }
        }
        this.f6880b.add(uyf0.f181593c);
        this.f6879a.m9298a(mapM203995b.get(uyf0.f181593c));
        this.f6879a.notifyDataSetChanged();
        if (this.f6880b.size() > 0) {
            this.f6888j.setSelection(0);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m9292p() {
        this.f6881c.m188561o(this.f6881c.m188552f() == 1.0d ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : 1.0d);
    }

    /* JADX INFO: renamed from: q */
    public final void m9293q(uyf0 uyf0Var) {
        int iRound = Math.round(((((float) b660.m102707c(uyf0Var.f181595b)) - 0.0f) * 100000.0f) / 200.0f);
        int iRound2 = Math.round(((((float) b660.m102706b(uyf0Var.f181594a)) - 0.0f) * 100000.0f) / 50.0f);
        this.f6886h.setProgress(iRound);
        this.f6887i.setProgress(iRound2);
    }

    /* JADX INFO: renamed from: com.facebook.rebound.ui.SpringConfiguratorView$c */
    public class C1737c implements gzf0 {
        public C1737c() {
        }

        @Override // p153l.gzf0
        /* JADX INFO: renamed from: c */
        public void mo9296c(syf0 syf0Var) {
            float fM188550d = (float) syf0Var.m188550d();
            float f = SpringConfiguratorView.this.f6883e;
            SpringConfiguratorView.this.setTranslationY((fM188550d * (SpringConfiguratorView.this.f6882d - f)) + f);
        }

        @Override // p153l.gzf0
        /* JADX INFO: renamed from: a */
        public void mo9294a(syf0 syf0Var) {
        }

        @Override // p153l.gzf0
        /* JADX INFO: renamed from: b */
        public void mo9295b(syf0 syf0Var) {
        }

        @Override // p153l.gzf0
        /* JADX INFO: renamed from: d */
        public void mo9297d(syf0 syf0Var) {
        }
    }

    public SpringConfiguratorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SpringConfiguratorView(Context context) {
        this(context, null);
    }
}
