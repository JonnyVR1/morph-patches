package p009l;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l.e51;
import l.eqh0;
import l.f6c0;
import l.qib0;
import l.u4c0;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xp5;
import v.AutoVDraweeView;
import v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class h5q0 extends BaseAdapter {

    /* JADX INFO: renamed from: a */
    public final Context f13871a;

    /* JADX INFO: renamed from: b */
    public List<Conversation> f13872b = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: c */
    public final Map<String, Message> f13873c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Set<String> f13874d = new HashSet();

    /* JADX INFO: renamed from: l.h5q0$a */
    public static class C0926a {

        /* JADX INFO: renamed from: a */
        public AutoVDraweeView f13875a;

        /* JADX INFO: renamed from: b */
        public View f13876b;

        /* JADX INFO: renamed from: c */
        public VText_NoTopPadding f13877c;

        /* JADX INFO: renamed from: d */
        public View f13878d;

        /* JADX INFO: renamed from: e */
        public VText_NoTopPadding f13879e;

        /* JADX INFO: renamed from: f */
        public VText_NoTopPadding f13880f;

        /* JADX INFO: renamed from: g */
        public AutoVDraweeView f13881g;

        public C0926a(View view) {
            this.f13875a = view.findViewById(u4c0.Af);
            this.f13876b = view.findViewById(u4c0.If);
            this.f13877c = view.findViewById(u4c0.Hf);
            this.f13878d = view.findViewById(u4c0.Gf);
            this.f13879e = view.findViewById(u4c0.Lf);
            this.f13880f = view.findViewById(u4c0.Mf);
            this.f13881g = view.findViewById(u4c0.Df);
        }
    }

    public h5q0(Context context) {
        this.f13871a = context;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15406b(C0926a c0926a) {
        ViewGroup.LayoutParams layoutParams;
        if (c0926a.f13878d == null) {
            return;
        }
        int width = c0926a.f13877c.getWidth();
        if (width > 0 && (layoutParams = c0926a.f13878d.getLayoutParams()) != null) {
            layoutParams.width = width + 4;
            c0926a.f13878d.setLayoutParams(layoutParams);
        }
        c0926a.f13877c.setVisibility(8);
    }

    /* JADX INFO: renamed from: d */
    public final Message m15408d(Conversation conversation) {
        if (conversation != null && !TextUtils.isEmpty(((DbObject) conversation).id)) {
            Message message = this.f13873c.get(((DbObject) conversation).id);
            if (message != null) {
                return message;
            }
            if (this.f13874d.contains(((DbObject) conversation).id)) {
                return null;
            }
            this.f13874d.add(((DbObject) conversation).id);
            final String str = ((DbObject) conversation).id;
            e51.y(new Runnable() { // from class: l.e5q0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12376a.m15412h(str);
                }
            });
        }
        return null;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Conversation getItem(int i) {
        if (i < 0 || i >= this.f13872b.size()) {
            return null;
        }
        return this.f13872b.get(i);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m15410f(User user) {
        if (CoreModule.c.N0.j3(user)) {
            return true;
        }
        long lastActiveTimeMillis = user.getLastActiveTimeMillis();
        if (lastActiveTimeMillis <= 0) {
            return false;
        }
        long jM18550o = mqi0.m18550o() - lastActiveTimeMillis;
        return (jM18550o >= 0 && jM18550o <= 300000) || (jM18550o >= 86400000 && jM18550o <= 432000000);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m15411g(Message message, String str) {
        if (message != null) {
            this.f13873c.put(str, message);
            notifyDataSetChanged();
        }
        this.f13874d.remove(str);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f13872b.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        C0926a c0926a;
        if (view == null) {
            view = LayoutInflater.from(this.f13871a).inflate(f6c0.Vc, viewGroup, false);
            c0926a = new C0926a(view);
            view.setTag(c0926a);
        } else {
            c0926a = (C0926a) view.getTag();
        }
        Conversation item = getItem(i);
        if (item != null) {
            m15414j(c0926a, item);
        }
        return view;
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m15412h(final String str) {
        List listJ = CoreModule.k.c.l0(str).j();
        final Message message = vwb.J(listJ) ? null : (Message) vwb.r(listJ, new w9j() { // from class: l.f5q0
            public final Object call(Object obj) {
                return Boolean.valueOf(xp5.k((Message) obj));
            }
        });
        e51.G(new Runnable() { // from class: l.g5q0
            @Override // java.lang.Runnable
            public final void run() {
                this.f13314a.m15411g(message, str);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public final void m15413i(C0926a c0926a, Conversation conversation, Message message) {
        boolean zL = xp5.l();
        String str = message != null ? message.value : "";
        boolean zIsEmpty = TextUtils.isEmpty(str);
        c0926a.f13879e.setTextColor(zL ? Color.parseColor("#999999") : -16777216);
        c0926a.f13879e.setTypeface(eqh0.c(zL ? 2 : 3));
        c0926a.f13879e.setText(str);
        double d = conversation.latestTime;
        if (d > 0.0d) {
            String strM18538G = mqi0.m18538G(d);
            VText_NoTopPadding vText_NoTopPadding = c0926a.f13880f;
            if (!zIsEmpty) {
                strM18538G = " · " + strM18538G;
            }
            vText_NoTopPadding.setText(strM18538G);
            xdl0.M(c0926a.f13880f, true);
        } else {
            xdl0.M(c0926a.f13880f, false);
        }
        if (message == null || vwb.J(message.media) || ((Media) message.media.get(0)).cover() == null || TextUtils.isEmpty(((Media) ((Media) message.media.get(0)).cover()).url)) {
            xdl0.M(c0926a.f13881g, false);
            return;
        }
        Picture pictureCover = ((Media) message.media.get(0)).cover();
        xdl0.M(c0926a.f13881g, true);
        c0926a.f13881g.setImageUrl(((Media) pictureCover).url);
        c0926a.f13881g.setZoomAnimationKey(Media.URL_TO_CACHEKEY(((Media) pictureCover).url) + "||" + ((DbObject) message).id);
    }

    /* JADX INFO: renamed from: j */
    public final void m15414j(final C0926a c0926a, Conversation conversation) {
        View view;
        User userPa = CoreModule.c.e0.Pa(conversation.otherUser);
        boolean zL = xp5.l();
        if (userPa != null && userPa.fp() != null) {
            if (zL) {
                qib0.G.Q0(c0926a.f13875a, userPa.fp().profileSmall());
            } else {
                qib0.G.O(c0926a.f13875a, userPa.fp().profileSmall().formatted(), 4, 10);
            }
        }
        xdl0.M(c0926a.f13876b, userPa != null && m15410f(userPa));
        c0926a.f13877c.setText(userPa != null ? userPa.name : "");
        if (zL || (view = c0926a.f13878d) == null) {
            xdl0.M(c0926a.f13878d, false);
            xdl0.M(c0926a.f13877c, true);
        } else {
            xdl0.M(view, true);
            c0926a.f13877c.setVisibility(4);
            c0926a.f13877c.post(new Runnable() { // from class: l.d5q0
                @Override // java.lang.Runnable
                public final void run() {
                    h5q0.m15406b(c0926a);
                }
            });
        }
        m15413i(c0926a, conversation, m15408d(conversation));
    }

    /* JADX INFO: renamed from: k */
    public void m15415k(List<Conversation> list) {
        String str;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        this.f13872b = list;
        HashSet hashSet = new HashSet();
        for (Conversation conversation : this.f13872b) {
            if (conversation != null && (str = ((DbObject) conversation).id) != null) {
                hashSet.add(str);
            }
        }
        this.f13873c.keySet().retainAll(hashSet);
        this.f13874d.retainAll(hashSet);
        notifyDataSetChanged();
    }
}
