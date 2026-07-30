package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.settings.addemoji.AddEmojiAct;
import com.p051p1.mobile.putong.data.EmojiType;
import com.p051p1.mobile.putong.data.User;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class r80 implements iam<q80> {

    /* JADX INFO: renamed from: a */
    public RecyclerView f161655a;

    /* JADX INFO: renamed from: b */
    public q80 f161656b;

    /* JADX INFO: renamed from: c */
    public AddEmojiAct f161657c;

    /* JADX INFO: renamed from: d */
    public cye f161658d;

    public r80(AddEmojiAct addEmojiAct) {
        this.f161657c = addEmojiAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f161657c;
    }

    /* JADX INFO: renamed from: a */
    public View m180169a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s80.m185051b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f161657c;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(q80 q80Var) {
        this.f161656b = q80Var;
    }

    /* JADX INFO: renamed from: c */
    public void m180171c(List<EmojiType> list) {
        cye cyeVar = new cye(act());
        this.f161658d = cyeVar;
        cyeVar.m113158T(list);
        this.f161655a.setAdapter(this.f161658d);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(act(), 4);
        gridLayoutManager.m3327v(new ize(this.f161658d, gridLayoutManager));
        this.f161655a.setLayoutManager(gridLayoutManager);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (jyb.m147479J(userM116600p9.profile.extensions.interest.emoji)) {
            return;
        }
        this.f161658d.m113160V(Integer.parseInt(userM116600p9.profile.extensions.interest.emoji.get(0)));
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m180169a(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
