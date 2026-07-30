package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLivePkPunishMotion;
import com.p046p1.mobile.putong.live.base.data.BLivePkSetting;
import com.p046p1.mobile.putong.live.base.data.BLiveSettings;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.api.LivingNormalApiProvider;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes5.dex */
public class d0b0 extends pat<ho2> {

    /* JADX INFO: renamed from: i */
    public View f83164i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f83165j;

    /* JADX INFO: renamed from: k */
    public TextView f83166k;

    /* JADX INFO: renamed from: l */
    public TextView f83167l;

    /* JADX INFO: renamed from: m */
    public RecyclerView f83168m;

    /* JADX INFO: renamed from: n */
    public TextView f83169n;

    /* JADX INFO: renamed from: o */
    public DialogC12611a f83170o;

    /* JADX INFO: renamed from: p */
    public c4g0 f83171p;

    /* JADX INFO: renamed from: q */
    public mp70 f83172q;

    /* JADX INFO: renamed from: r */
    public xza0 f83173r;

    public d0b0(bsm bsmVar, mp70 mp70Var) {
        super(bsmVar);
        this.f83172q = mp70Var;
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ void m109464K3(BLivePkSetting bLivePkSetting, ArrayList arrayList, final String str) {
        BLivePkPunishMotion bLivePkPunishMotion = (BLivePkPunishMotion) vwb.m200346r(bLivePkSetting.pkMotions, new w9j() { // from class: l.c0b0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(str, ((BLivePkPunishMotion) obj).f44427id));
            }
        });
        if (bLivePkPunishMotion != null) {
            arrayList.add(bLivePkPunishMotion);
        }
    }

    /* JADX INFO: renamed from: N3 */
    public static /* synthetic */ void m109467N3(roj0 roj0Var) {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: W3 */
    private void m109468W3() {
        mkd0.m154992z(this.f83171p);
        this.f83171p = m129299H3(m206027E2().m132139i2(TimeUnit.SECONDS)).subscribe(ffw.m121193d(new e30() { // from class: l.b0b0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72422a.m109469X3((Long) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X3 */
    public void m109469X3(Long l2) {
        if (10 - l2.longValue() <= 0) {
            mkd0.m154992z(this.f83171p);
            xza0 xza0Var = this.f83173r;
            m109471P3(xza0Var.getItem(zbc0.f202434a.nextInt(xza0Var.getPageCount())).f44427id, true);
        }
        this.f83169n.setText(m109474T3((int) (10 - l2.longValue())));
    }

    /* JADX INFO: renamed from: O3 */
    public View m109470O3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e0b0.m114173b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: P3 */
    public void m109471P3(String str, boolean z) {
        ht70.m132853j("choosePunish punishId:" + str + ",isAuto:" + z);
        m109472R3();
        duringCreated(LivingNormalApiProvider.m71637z7(this.f83172q.m155783T3(), str, z)).subscribe(ffw.m121194e(new e30() { // from class: l.zza0
            @Override // p149l.e30
            public final void call(Object obj) {
                d0b0.m109467N3((roj0) obj);
            }
        }, new a280()));
    }

    /* JADX INFO: renamed from: R3 */
    public void m109472R3() {
        DialogC12611a dialogC12611a = this.f83170o;
        if (dialogC12611a != null) {
            dialogC12611a.dismiss();
        }
        mkd0.m154992z(this.f83171p);
    }

    /* JADX INFO: renamed from: S3 */
    public final List<BLivePkPunishMotion> m109473S3() {
        final ArrayList arrayList = new ArrayList();
        BLiveSettings bLiveSettingsM195583A3 = ypv.m215672k().m195583A3();
        if (bLiveSettingsM195583A3 == null) {
            return arrayList;
        }
        final BLivePkSetting bLivePkSetting = bLiveSettingsM195583A3.liveConfig.f44352pk;
        vwb.m200354z(bLivePkSetting.punishMotionSelectIds, new e30() { // from class: l.a0b0
            @Override // p149l.e30
            public final void call(Object obj) {
                d0b0.m109464K3(bLivePkSetting, arrayList, (String) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: T3 */
    public final String m109474T3(long j) {
        return String.format(ypv.f199497e.getString(R$string.f46722Hb), String.valueOf(j));
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m109475U3(String str) {
        m109471P3(str, false);
    }

    /* JADX INFO: renamed from: V3 */
    public void m109476V3(Act act) {
        if (this.f83170o == null) {
            this.f83170o = new byr(this, m109470O3(act.inflater(), null));
            this.f83168m.setLayoutManager(new LinearLayoutManager(act, 0, false));
            xza0 xza0Var = new xza0();
            this.f83173r = xza0Var;
            this.f83168m.setAdapter(xza0Var);
            this.f83173r.m211948I(new e30() { // from class: l.yza0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f200856a.m109475U3((String) obj);
                }
            });
        }
        BLiveUserMask bLiveUserMask = (BLiveUserMask) m129297F3(new v220(600));
        this.f83165j.setImageResource(i3c0.f110754J8);
        if (!w220.m201015b() || bLiveUserMask == null) {
            hxs.m133407t("context_single_room", this.f83165j, ypv.f199493a.m199329V().picture(0).url, t100.f167275x);
            this.f83166k.setText(ypv.f199493a.m199329V().name);
        } else {
            hxs.m133407t("context_single_room", this.f83165j, bLiveUserMask.avatar, t100.f167275x);
            this.f83166k.setText(bLiveUserMask.name);
        }
        this.f83169n.setText(m109474T3(10L));
        if (((idv) ypv.m215673l(fld0.f98147b)).m135637i(ypv.f199493a.m199309D0()).hierarchy.grade < 38 || w220.m201015b()) {
            this.f83167l.setText(act.getString(R$string.f46935Ra));
        } else {
            this.f83167l.setText(act.getString(R$string.f47040Wa));
        }
        m109468W3();
        this.f83173r.m211949J(m109473S3());
        this.f83170o.show();
    }
}
