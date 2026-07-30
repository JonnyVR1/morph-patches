package p149l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p147v.AutoVDraweeView;
import p147v.VText_NoTopPadding;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class h5q0 extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final Context f105966a;

    /* JADX INFO: renamed from: b */
    public List<Conversation> f105967b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c */
    public final Map<String, Message> f105968c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Set<String> f105969d = new HashSet();

    /* JADX INFO: renamed from: l.h5q0$a */
    public static class C17230a {

        /* JADX INFO: renamed from: a */
        public AutoVDraweeView f105970a;

        /* JADX INFO: renamed from: b */
        public View f105971b;

        /* JADX INFO: renamed from: c */
        public VText_NoTopPadding f105972c;

        /* JADX INFO: renamed from: d */
        public View f105973d;

        /* JADX INFO: renamed from: e */
        public VText_NoTopPadding f105974e;

        /* JADX INFO: renamed from: f */
        public VText_NoTopPadding f105975f;

        /* JADX INFO: renamed from: g */
        public AutoVDraweeView f105976g;

        public C17230a(View view) {
            this.f105970a = (AutoVDraweeView) view.findViewById(u4c0.f173732Af);
            this.f105971b = view.findViewById(u4c0.f173868If);
            this.f105972c = (VText_NoTopPadding) view.findViewById(u4c0.f173851Hf);
            this.f105973d = view.findViewById(u4c0.f173834Gf);
            this.f105974e = (VText_NoTopPadding) view.findViewById(u4c0.f173919Lf);
            this.f105975f = (VText_NoTopPadding) view.findViewById(u4c0.f173936Mf);
            this.f105976g = (AutoVDraweeView) view.findViewById(u4c0.f173783Df);
        }
    }

    public h5q0(Context context) {
        this.f105966a = context;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m129443b(C17230a c17230a) {
        ViewGroup.LayoutParams layoutParams;
        if (c17230a.f105973d == null) {
            return;
        }
        int width = c17230a.f105972c.getWidth();
        if (width > 0 && (layoutParams = c17230a.f105973d.getLayoutParams()) != null) {
            layoutParams.width = width + 4;
            c17230a.f105973d.setLayoutParams(layoutParams);
        }
        c17230a.f105972c.setVisibility(8);
    }

    /* JADX INFO: renamed from: d */
    public final Message m129445d(Conversation conversation) {
        if (conversation != null && !TextUtils.isEmpty(conversation.f56011id)) {
            Message message = this.f105968c.get(conversation.f56011id);
            if (message != null) {
                return message;
            }
            if (this.f105969d.contains(conversation.f56011id)) {
                return null;
            }
            this.f105969d.add(conversation.f56011id);
            final String str = conversation.f56011id;
            e51.m114774y(new Runnable() { // from class: l.e5q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f89455a.m129449h(str);
                }
            });
        }
        return null;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Conversation getItem(int i) {
        if (i < 0 || i >= this.f105967b.size()) {
            return null;
        }
        return this.f105967b.get(i);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m129447f(User user) {
        if (CoreModule.f17545c.f19588N0.m31966j3(user)) {
            return true;
        }
        long lastActiveTimeMillis = user.getLastActiveTimeMillis();
        if (lastActiveTimeMillis <= 0) {
            return false;
        }
        long jM155944o = mqi0.m155944o() - lastActiveTimeMillis;
        return (jM155944o >= 0 && jM155944o <= Constants.INBOX_V2_THROTTLE_WINDOW_MS) || (jM155944o >= 86400000 && jM155944o <= 432000000);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m129448g(Message message, String str) {
        if (message != null) {
            this.f105968c.put(str, message);
            notifyDataSetChanged();
        }
        this.f105969d.remove(str);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f105967b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C17230a c17230a;
        if (view == null) {
            view = LayoutInflater.from(this.f105966a).inflate(f6c0.f95615Vc, viewGroup, false);
            c17230a = new C17230a(view);
            view.setTag(c17230a);
        } else {
            c17230a = (C17230a) view.getTag();
        }
        Conversation item = getItem(i);
        if (item != null) {
            m129451j(c17230a, item);
        }
        return view;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m129449h(final String str) {
        Collection collectionM165617j = CoreModule.f17553k.f91940c.m206080l0(str).m165617j();
        final Message message = vwb.m200296J(collectionM165617j) ? null : (Message) vwb.m200346r(collectionM165617j, new w9j() { // from class: l.f5q0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(xp5.m210471k((Message) obj));
            }
        });
        e51.m114742G(new Runnable() { // from class: l.g5q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f101183a.m129448g(message, str);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m129450i(C17230a c17230a, Conversation conversation, Message message) {
        boolean zM210472l = xp5.m210472l();
        String str = message != null ? message.value : "";
        boolean zIsEmpty = TextUtils.isEmpty(str);
        c17230a.f105974e.setTextColor(zM210472l ? Color.parseColor("#999999") : RoundedDrawable.DEFAULT_BORDER_COLOR);
        c17230a.f105974e.setTypeface(eqh0.m117752c(zM210472l ? 2 : 3));
        c17230a.f105974e.setText(str);
        double d = conversation.latestTime;
        if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            String strM155932G = mqi0.m155932G(d);
            VText_NoTopPadding vText_NoTopPadding = c17230a.f105975f;
            if (!zIsEmpty) {
                strM155932G = " · " + strM155932G;
            }
            vText_NoTopPadding.setText(strM155932G);
            xdl0.m208344M(c17230a.f105975f, true);
        } else {
            xdl0.m208344M(c17230a.f105975f, false);
        }
        if (message == null || vwb.m200296J(message.media) || message.media.get(0).cover() == null || TextUtils.isEmpty(message.media.get(0).cover().url)) {
            xdl0.m208344M(c17230a.f105976g, false);
            return;
        }
        Picture pictureCover = message.media.get(0).cover();
        xdl0.m208344M(c17230a.f105976g, true);
        c17230a.f105976g.setImageUrl(pictureCover.url);
        c17230a.f105976g.setZoomAnimationKey(Media.URL_TO_CACHEKEY(pictureCover.url) + "||" + message.f56011id);
    }

    /* JADX INFO: renamed from: j */
    public final void m129451j(final C17230a c17230a, Conversation conversation) {
        View view;
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(conversation.otherUser);
        boolean zM210472l = xp5.m210472l();
        if (userM169430Pa != null && userM169430Pa.m60124fp() != null) {
            if (zM210472l) {
                qib0.f154691G.m102341Q0(c17230a.f105970a, userM169430Pa.m60124fp().profileSmall());
            } else {
                qib0.f154691G.m102336O(c17230a.f105970a, userM169430Pa.m60124fp().profileSmall().formatted(), 4, 10);
            }
        }
        xdl0.m208344M(c17230a.f105971b, userM169430Pa != null && m129447f(userM169430Pa));
        c17230a.f105972c.setText(userM169430Pa != null ? userM169430Pa.name : "");
        if (zM210472l || (view = c17230a.f105973d) == null) {
            xdl0.m208344M(c17230a.f105973d, false);
            xdl0.m208344M(c17230a.f105972c, true);
        } else {
            xdl0.m208344M(view, true);
            c17230a.f105972c.setVisibility(4);
            c17230a.f105972c.post(new Runnable() { // from class: l.d5q0
                @Override // java.lang.Runnable
                public final void run() {
                    h5q0.m129443b(c17230a);
                }
            });
        }
        m129450i(c17230a, conversation, m129445d(conversation));
    }

    /* JADX INFO: renamed from: k */
    public void m129452k(List<Conversation> list) {
        String str;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f105967b = list;
        HashSet hashSet = new HashSet();
        for (Conversation conversation : this.f105967b) {
            if (conversation != null && (str = conversation.f56011id) != null) {
                hashSet.add(str);
            }
        }
        this.f105968c.keySet().retainAll(hashSet);
        this.f105969d.retainAll(hashSet);
        notifyDataSetChanged();
    }
}
