package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLivePkPunishMotion;
import com.p051p1.mobile.putong.live.base.data.BLivePkSetting;
import com.p051p1.mobile.putong.live.base.data.BLiveSettings;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class h8b0 extends qct<oo2> {

    /* JADX INFO: renamed from: i */
    public View f108222i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f108223j;

    /* JADX INFO: renamed from: k */
    public TextView f108224k;

    /* JADX INFO: renamed from: l */
    public TextView f108225l;

    /* JADX INFO: renamed from: m */
    public RecyclerView f108226m;

    /* JADX INFO: renamed from: n */
    public TextView f108227n;

    /* JADX INFO: renamed from: o */
    public DialogC12774a f108228o;

    /* JADX INFO: renamed from: p */
    public kcg0 f108229p;

    /* JADX INFO: renamed from: q */
    public sx70 f108230q;

    /* JADX INFO: renamed from: r */
    public b8b0 f108231r;

    public h8b0(dum dumVar, sx70 sx70Var) {
        super(dumVar);
        this.f108230q = sx70Var;
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m133916K3(BLivePkSetting bLivePkSetting, ArrayList arrayList, final String str) {
        BLivePkPunishMotion bLivePkPunishMotion = (BLivePkPunishMotion) jyb.m147529r(bLivePkSetting.pkMotions, new qcj() { // from class: l.g8b0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLivePkPunishMotion) obj).f45275id));
            }
        });
        if (bLivePkPunishMotion != null) {
            arrayList.add(bLivePkPunishMotion);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m133919N3(uxj0 uxj0Var) {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: W3 */
    private void m133920W3() {
        psd0.m173633z(this.f108229p);
        this.f108229p = m138858H3(m213810E2().m168525i2(TimeUnit.SECONDS)).subscribe(dhw.m115825d(new y20() { // from class: l.f8b0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f97710a.m133921X3((Long) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public void m133921X3(Long l2) {
        if (10 - l2.longValue() <= 0) {
            psd0.m173633z(this.f108229p);
            b8b0 b8b0Var = this.f108231r;
            m133923P3(b8b0Var.getItem(gkc0.f104723a.nextInt(b8b0Var.getPageCount())).f45275id, true);
        }
        this.f108227n.setText(m133926T3((int) (10 - l2.longValue())));
    }

    /* JADX INFO: renamed from: O3 */
    public View m133922O3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return i8b0.m138998b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: P3 */
    public void m133923P3(String str, boolean z) {
        n180.m161093j("choosePunish punishId:" + str + ",isAuto:" + z);
        m133924R3();
        duringCreated(LivingNormalApiProvider.m72820z7(this.f108230q.m188450T3(), str, z)).subscribe(dhw.m115826e(new y20() { // from class: l.d8b0
            @Override // p153l.y20
            public final void call(Object obj) {
                h8b0.m133919N3((uxj0) obj);
            }
        }, new ga80()));
    }

    /* JADX INFO: renamed from: R3 */
    public void m133924R3() {
        DialogC12774a dialogC12774a = this.f108228o;
        if (dialogC12774a != null) {
            dialogC12774a.dismiss();
        }
        psd0.m173633z(this.f108229p);
    }

    /* JADX INFO: renamed from: S3 */
    public final List<BLivePkPunishMotion> m133925S3() {
        final ArrayList arrayList = new ArrayList();
        BLiveSettings bLiveSettingsM203370A3 = zrv.m221193k().m203370A3();
        if (bLiveSettingsM203370A3 == null) {
            return arrayList;
        }
        final BLivePkSetting bLivePkSetting = bLiveSettingsM203370A3.liveConfig.f45200pk;
        jyb.m147537z(bLivePkSetting.punishMotionSelectIds, new y20() { // from class: l.e8b0
            @Override // p153l.y20
            public final void call(Object obj) {
                h8b0.m133916K3(bLivePkSetting, arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: T3 */
    public final String m133926T3(long j) {
        return String.format(zrv.f205803e.getString(R$string.f47570Hb), String.valueOf(j));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m133927U3(String str) {
        m133923P3(str, false);
    }

    /* JADX INFO: renamed from: V3 */
    public void m133928V3(Act act) {
        if (this.f108228o == null) {
            this.f108228o = new c0s(this, m133922O3(act.inflater(), null));
            this.f108226m.setLayoutManager(new LinearLayoutManager(act, 0, false));
            b8b0 b8b0Var = new b8b0();
            this.f108231r = b8b0Var;
            this.f108226m.setAdapter(b8b0Var);
            this.f108231r.m102960I(new y20() { // from class: l.c8b0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f80193a.m133927U3((String) obj);
                }
            });
        }
        BLiveUserMask bLiveUserMask = (BLiveUserMask) m138856F3(new db20(600));
        this.f108223j.setImageResource(obc0.f146082J8);
        if (!eb20.m120149b() || bLiveUserMask == null) {
            izs.m142869t("context_single_room", this.f108223j, zrv.f205799a.m207651V().picture(0).url, qa00.f156337x);
            this.f108224k.setText(zrv.f205799a.m207651V().name);
        } else {
            izs.m142869t("context_single_room", this.f108223j, bLiveUserMask.avatar, qa00.f156337x);
            this.f108224k.setText(bLiveUserMask.name);
        }
        this.f108227n.setText(m133926T3(10L));
        if (((jfv) zrv.m221194l(htd0.f111520b)).m144722i(zrv.f205799a.m207631D0()).hierarchy.grade < 38 || eb20.m120149b()) {
            this.f108225l.setText(act.getString(R$string.f47783Ra));
        } else {
            this.f108225l.setText(act.getString(R$string.f47888Wa));
        }
        m133920W3();
        this.f108231r.m102961J(m133925S3());
        this.f108228o.show();
    }
}
