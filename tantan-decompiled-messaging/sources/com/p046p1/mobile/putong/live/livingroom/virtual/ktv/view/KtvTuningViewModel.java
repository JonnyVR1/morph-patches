package com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceKtvPlayInfo;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.bean.KtvAcousticsBean;
import java.util.ArrayList;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLine;
import p147v.VLinear;
import p147v.VSwitchButton;
import p147v.VText;
import p149l.a5r;
import p149l.byr;
import p149l.i3c0;
import p149l.s7m;
import p149l.t100;
import p149l.t6c0;
import p149l.w4r;
import p149l.wxs;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class KtvTuningViewModel extends FrameLayout implements s7m<w4r>, View.OnClickListener {

    /* JADX INFO: renamed from: a */
    public VFrame f52460a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f52461b;

    /* JADX INFO: renamed from: c */
    public VImage f52462c;

    /* JADX INFO: renamed from: d */
    public VText f52463d;

    /* JADX INFO: renamed from: e */
    public VLine f52464e;

    /* JADX INFO: renamed from: f */
    public VSwitchButton f52465f;

    /* JADX INFO: renamed from: g */
    public TextView f52466g;

    /* JADX INFO: renamed from: h */
    public TextView f52467h;

    /* JADX INFO: renamed from: i */
    public VSwitchButton f52468i;

    /* JADX INFO: renamed from: j */
    public TextView f52469j;

    /* JADX INFO: renamed from: k */
    public VText f52470k;

    /* JADX INFO: renamed from: l */
    public VImage f52471l;

    /* JADX INFO: renamed from: m */
    public KtvTuningSeekBar f52472m;

    /* JADX INFO: renamed from: n */
    public VText f52473n;

    /* JADX INFO: renamed from: o */
    public VImage f52474o;

    /* JADX INFO: renamed from: p */
    public KtvTuningSeekBar f52475p;

    /* JADX INFO: renamed from: q */
    public HorizontalScrollView f52476q;

    /* JADX INFO: renamed from: r */
    public VLinear f52477r;

    /* JADX INFO: renamed from: s */
    public VImage f52478s;

    /* JADX INFO: renamed from: t */
    public VImage f52479t;

    /* JADX INFO: renamed from: u */
    public TextView f52480u;

    /* JADX INFO: renamed from: v */
    public TextView f52481v;

    /* JADX INFO: renamed from: w */
    public DialogC12611a f52482w;

    /* JADX INFO: renamed from: x */
    public w4r f52483x;

    /* JADX INFO: renamed from: y */
    public KtvAcousticsItemView f52484y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvTuningViewModel$a */
    public class C12965a implements SeekBar.OnSeekBarChangeListener {
        public C12965a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            KtvTuningViewModel.this.f52471l.setImageResource(seekBar.getProgress() == 0 ? i3c0.f110767K9 : i3c0.f110779L9);
            KtvTuningViewModel.this.f52483x.m201554c4(i);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvTuningViewModel$b */
    public class C12966b implements SeekBar.OnSeekBarChangeListener {
        public C12966b() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            KtvTuningViewModel.this.f52474o.setImageResource(seekBar.getProgress() == 0 ? i3c0.f110767K9 : i3c0.f110779L9);
            KtvTuningViewModel.this.f52483x.m201552a4(i);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
        }
    }

    public KtvTuningViewModel(@NonNull Context context) {
        super(context);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public View m77121d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a5r.m95057b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(w4r w4rVar) {
        this.f52483x = w4rVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m77123f() {
        KtvAcousticsItemView ktvAcousticsItemView = this.f52484y;
        if (ktvAcousticsItemView != null) {
            ktvAcousticsItemView.setSelected(false);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m77124i(CompoundButton compoundButton, boolean z) {
        this.f52483x.m201551Z3(z);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m77121d(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m77125j(CompoundButton compoundButton, boolean z) {
        this.f52483x.m201553b4(z);
    }

    /* JADX INFO: renamed from: k */
    public void m77126k(Boolean bool) {
        if (this.f52482w != null) {
            this.f52479t.setImageResource(bool.booleanValue() ? i3c0.f110755J9 : i3c0.f110791M9);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m77127l() {
        xdl0.m208329E0(this.f52460a, this);
        xdl0.m208329E0(this.f52462c, this);
        xdl0.m208329E0(this.f52478s, this);
        xdl0.m208329E0(this.f52481v, this);
        xdl0.m208329E0(this.f52480u, this);
        this.f52465f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.y4r
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f196329a.m77124i(compoundButton, z);
            }
        });
        this.f52468i.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.z4r
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f201626a.m77125j(compoundButton, z);
            }
        });
        this.f52472m.setOnSeekBarChangeListener(new C12965a());
        this.f52475p.setOnSeekBarChangeListener(new C12966b());
        ArrayList<KtvAcousticsBean> ktvAcoustics = KtvAcousticsBean.getKtvAcoustics();
        int i = 0;
        while (i < ktvAcoustics.size()) {
            KtvAcousticsItemView ktvAcousticsItemView = (KtvAcousticsItemView) LayoutInflater.from(getContext()).inflate(t6c0.f168226W2, (ViewGroup) null);
            int iMax = Math.max((int) (((xdl0.m208412y0() - t100.m186890d(40.0f)) - ((ktvAcoustics.size() - 1) * t100.m186890d(10.0f))) / (ktvAcoustics.size() * 1.0f)), t100.m186890d(56.0f));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iMax, (int) ((iMax * 70) / 60.0f));
            layoutParams.leftMargin = i > 0 ? t100.m186890d(10.0f) : 0;
            this.f52477r.addView(ktvAcousticsItemView, layoutParams);
            ktvAcousticsItemView.setTag(Integer.valueOf(ktvAcoustics.get(i).preset));
            xdl0.m208329E0(ktvAcousticsItemView, this);
            ktvAcousticsItemView.setData(ktvAcoustics.get(i));
            i++;
        }
    }

    /* JADX INFO: renamed from: m */
    public void m77128m(wxs wxsVar, BLiveVoiceKtvPlayInfo bLiveVoiceKtvPlayInfo) {
        if (this.f52482w == null) {
            this.f52482w = new byr(wxsVar, m77121d(LayoutInflater.from(getContext()), null));
            m77127l();
        }
        m77126k(Boolean.valueOf(this.f52483x.m201546T3()));
        this.f52472m.setProgress(this.f52483x.m201545R3());
        this.f52475p.setProgress(this.f52483x.m201544P3());
        this.f52482w.show();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view.getId() == this.f52462c.getId() || view.getId() == this.f52460a.getId()) {
            DialogC12611a dialogC12611a = this.f52482w;
            if (dialogC12611a != null) {
                dialogC12611a.dismiss();
                return;
            }
            return;
        }
        if (view.getId() == this.f52478s.getId()) {
            w4r w4rVar = this.f52483x;
            if (w4rVar != null) {
                w4rVar.m201558g4(!w4rVar.m201546T3());
                return;
            }
            return;
        }
        if (view.getId() == this.f52481v.getId()) {
            this.f52483x.m201549X3();
            return;
        }
        if (view.getId() == this.f52480u.getId()) {
            this.f52483x.m201556e4();
            DialogC12611a dialogC12611a2 = this.f52482w;
            if (dialogC12611a2 != null) {
                dialogC12611a2.dismiss();
                return;
            }
            return;
        }
        if (view.getId() != this.f52461b.getId() && (view instanceof KtvAcousticsItemView)) {
            m77123f();
            KtvAcousticsItemView ktvAcousticsItemView = (KtvAcousticsItemView) view;
            this.f52484y = ktvAcousticsItemView;
            ktvAcousticsItemView.setSelected(true);
            this.f52483x.m201550Y3(((Integer) this.f52484y.getTag()).intValue());
        }
    }

    public void setAudioEffectPreset(int i) {
        for (int i2 = 0; i2 < this.f52477r.getChildCount(); i2++) {
            View childAt = this.f52477r.getChildAt(i2);
            if (((Integer) childAt.getTag()).intValue() == i) {
                childAt.performClick();
                return;
            }
        }
    }

    public void setEarClickable(Boolean bool) {
        VSwitchButton vSwitchButton = this.f52465f;
        if (vSwitchButton != null) {
            vSwitchButton.setClickable(bool.booleanValue());
        }
    }

    public void setEarSwitcher(Boolean bool) {
        this.f52465f.setChecked(bool.booleanValue());
    }

    public void setOriginalSwitcher(Boolean bool) {
        this.f52468i.setChecked(bool.booleanValue());
    }

    public KtvTuningViewModel(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
