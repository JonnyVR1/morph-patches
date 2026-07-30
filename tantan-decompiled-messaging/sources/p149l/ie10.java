package p149l;

import android.view.View;
import android.widget.CompoundButton;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkAsset;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.p065ui.datepicker.WheelView;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class ie10 extends z5t<gg10> {

    /* JADX INFO: renamed from: q */
    public BLiveMultiPkAsset f112703q;

    /* JADX INFO: renamed from: r */
    public int f112704r;

    /* JADX INFO: renamed from: s */
    public int f112705s;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public /* synthetic */ void m135642B(View view) {
        if (this.f201849h.getVisibility() == 0) {
            m135653H(false);
        } else {
            mo71727j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public /* synthetic */ void m135643C(View view) {
        this.f201852k.setText(String.format(Locale.CHINA, "%ds", Integer.valueOf(this.f112704r)));
        m135653H(false);
        ((gg10) this.f47706b).m125946X3(this.f201854m.isChecked(), this.f112704r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public /* synthetic */ void m135644E(View view) {
        m135653H(true);
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m135650A(WheelView wheelView, l01 l01Var, int i) {
        this.f112704r = this.f112703q.durations.get(i).duration;
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m135651F(CompoundButton compoundButton, boolean z) {
        if (this.f112703q.rejectInvite == z) {
            ((gg10) this.f47706b).m125946X3(z, this.f112704r);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m135652G(BLiveMultiPkAsset bLiveMultiPkAsset) {
        this.f112703q = bLiveMultiPkAsset;
        this.f201854m.setChecked(!bLiveMultiPkAsset.rejectInvite);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < bLiveMultiPkAsset.durations.size(); i++) {
            arrayList.add(bLiveMultiPkAsset.durations.get(i).duration + BLiveStormDanmakuGiftResourceType.f44446s);
            if (bLiveMultiPkAsset.durations.get(i).picked) {
                this.f112705s = i;
                this.f112704r = bLiveMultiPkAsset.durations.get(i).duration;
                this.f201852k.setText(String.format(Locale.CHINA, "%ds", Integer.valueOf(bLiveMultiPkAsset.durations.get(i).duration)));
            }
        }
        this.f201857p.setData(arrayList);
        this.f201857p.setSelectedPosition(this.f112705s);
    }

    /* JADX INFO: renamed from: H */
    public final void m135653H(boolean z) {
        this.f201849h.setVisibility(z ? 0 : 8);
        this.f201855n.setVisibility(z ? 0 : 8);
        this.f201848g.setText(z ? "PK时长" : "PK设置");
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder, p149l.vpl
    public void init() {
        super.init();
        this.f201857p.setNormalTextColor(this.f201855n.getResources().getColor(h1c0.f105374i1));
        this.f201857p.setSelectedTextColor(this.f201855n.getResources().getColor(h1c0.f105395p1));
        this.f201857p.setTextSize(18.0f);
        this.f201857p.setLineSpacing(35.0f);
        mep0.m154302d1(this.f201856o, 10);
        this.f201857p.setOnItemSelectedListener(new ie50() { // from class: l.de10
            @Override // p149l.ie50
            /* JADX INFO: renamed from: c */
            public final void mo111089c(WheelView wheelView, l01 l01Var, int i) {
                this.f85694a.m135650A(wheelView, l01Var, i);
            }
        });
        this.f201855n.setVisibility(8);
        this.f201849h.setVisibility(8);
        xdl0.m208329E0(this.f201847f, new View.OnClickListener() { // from class: l.ee10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f90661a.m135642B(view);
            }
        });
        xdl0.m208329E0(this.f201849h, new View.OnClickListener() { // from class: l.fe10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f97093a.m135643C(view);
            }
        });
        xdl0.m208329E0(this.f201852k, new View.OnClickListener() { // from class: l.ge10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f102145a.m135644E(view);
            }
        });
        this.f201854m.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: l.he10
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                this.f107324a.m135651F(compoundButton, z);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.BaseDialogHolder
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return i3c0.f111189v;
    }
}
