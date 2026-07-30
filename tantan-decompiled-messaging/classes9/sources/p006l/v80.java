package p006l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.settings.addemoji.AddEmojiAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.data.EmojiType;
import com.p1.mobile.putong.data.User;
import java.util.List;
import l.s7m;
import l.vwb;
import l.w80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class v80 implements s7m<u80> {

    /* JADX INFO: renamed from: a */
    public RecyclerView f24209a;

    /* JADX INFO: renamed from: b */
    public u80 f24210b;

    /* JADX INFO: renamed from: c */
    public AddEmojiAct f24211c;

    /* JADX INFO: renamed from: d */
    public ywe f24212d;

    public v80(AddEmojiAct addEmojiAct) {
        this.f24211c = addEmojiAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m25765C0() {
        return this.f24211c;
    }

    /* JADX INFO: renamed from: a */
    public View m25766a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w80.b(this, layoutInflater, viewGroup);
    }

    @Nullable
    public Act act() {
        return this.f24211c;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m25769i1(u80 u80Var) {
        this.f24210b = u80Var;
    }

    /* JADX INFO: renamed from: c */
    public void m25768c(List<EmojiType> list) {
        ywe yweVar = new ywe(act());
        this.f24212d = yweVar;
        yweVar.m28441T(list);
        this.f24209a.setAdapter(this.f24212d);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 4);
        gridLayoutManager.v(new eye(this.f24212d, gridLayoutManager));
        this.f24209a.setLayoutManager(gridLayoutManager);
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        if (vwb.J(userM21490p9.profile.extensions.interest.emoji)) {
            return;
        }
        this.f24212d.m28443V(Integer.parseInt((String) userM21490p9.profile.extensions.interest.emoji.get(0)));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m25766a(layoutInflater, viewGroup);
    }

    public void destroy() {
    }
}
