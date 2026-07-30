package p003l;

import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
@RequiresApi(19)
public class eoj0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0279b f3343a = new fye();

    /* JADX INFO: renamed from: l.eoj0$b */
    public interface InterfaceC0279b {
        /* JADX INFO: renamed from: a */
        CharSequence mo3919a(CharSequence charSequence);

        /* JADX INFO: renamed from: b */
        boolean mo3920b(String str);

        /* JADX INFO: renamed from: c */
        void mo3921c(Runnable runnable);
    }

    /* JADX INFO: renamed from: b */
    public static void m3913b() {
        f3343a.mo3921c(new Runnable() { // from class: l.aoj0
            @Override // java.lang.Runnable
            public final void run() {
                eoj0.C0278a.m3918d();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m3914c(CharSequence charSequence) {
        return f3343a.mo3919a(charSequence);
    }

    /* JADX INFO: renamed from: l.eoj0$a */
    public static final class C0278a {

        /* JADX INFO: renamed from: a */
        public static final List<String> f3344a = vwb.n(Arrays.asList("😀", "😃", "😄", "😁", "😆", "😅", "😂", "🙂", "🙃", "😉", "😊", "😇", "😍", "😘", "😗", "☺️", "😚", "😙", "😋", "😛", "😜", "😝", "🤑", "🤗", "🤔", "🤐", "😐", "😑", "😶", "😏", "😒", "🙄", "😬", "😌", "😔", "😪", "😴", "😷", "🤒", "🤕", "😵", "😎", "🤓", "😕", "😟", "🙁", "☹️", "😮", "😯", "😲", "😳", "😦", "😧", "😨", "😰", "😥", "😢", "😭", "😱", "😖", "😣", "😞", "😓", "😩", "😫", "😤", "😡", "😠", "😈", "👿", "💀", "☠️", "💩", "😺", "😸", "😹", "😻", "😼", "😽", "🙀", "😿", "😾", "🙈", "🙉", "🙊", "💋", "💘", "💝", "💖", "💗", "💓", "💞", "💕", "💔", "❤️", "💯", "👋", "🖐", "✋", "🖖", "👌", "✌️", "🤘", "👈", "👉", "👆", "🖕", "👇", "☝️", "👍", "👎", "✊", "👊", "👏", "🙌", "👐", "🙏", "✍️", "💅", "💪", "👂", "👃", "👀", "👁", "👅", "👄", "🙍", "🙎", "🙅", "🙆", "💁", "🙋", "🙇", "👮", "🕵", "🎅", "💆", "💇", "🚶", "🏃", "💃", "🕴", "👯", "🏇", "⛷️", "🏂", "🏌", "🏄", "🚣", "🏊", "⛹️", "🏋", "🚴", "🚵", "🛀", "🛌", "👭", "💏", "💑", "👪"), new w9j() { // from class: l.boj0
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(eoj0.f3343a.mo3920b((String) obj));
            }
        });

        /* JADX INFO: renamed from: b */
        public static final List<String> f3345b = vwb.n(Arrays.asList("🐶", "🐕", "🐩", "🐺", "🐱", "🐈", "🦁", "🐯", "🐅", "🐆", "🐴", "🐎", "🦄", "🐮", "🐂", "🐃", "🐄", "🐷", "🐖", "🐗", "🐽", "🐏", "🐑", "🐐", "🐪", "🐫", "🐘", "🐭", "🐁", "🐀", "🐹", "🐰", "🐇", "🐿", "🐻", "🐨", "🐼", "🐾", "🦃", "🐔", "🐓", "🐣", "🐤", "🐥", "🐦", "🐧", "🕊", "🐸", "🐊", "🐢", "🐍", "🐲", "🐉", "🐳", "🐋", "🐬", "🐟", "🐠", "🐡", "🐙", "🐚", "🐌", "🐛", "🐜", "🐝", "🐞", "🕷", "🕸", "🦂", "💐", "🌸", "💮", "🏵", "🌹", "🌺", "🌻", "🌼", "🌷", "🌱", "🌲", "🌳", "🌴", "🌵", "🌾", "🌿", "☘️", "🍀", "🍁", "🍂", "🍃"), new w9j() { // from class: l.coj0
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(eoj0.f3343a.mo3920b((String) obj));
            }
        });

        /* JADX INFO: renamed from: c */
        public static final List<String> f3346c = vwb.n(Arrays.asList("🍇", "🍈", "🍉", "🍊", "🍋", "🍌", "🍍", "🍎", "🍏", "🍐", "🍑", "🍒", "🍓", "🍅", "🍆", "🌽", "🌶", "🍄", "🌰", "🍞", "🧀", "🍖", "🍗", "🍔", "🍟", "🍕", "🌭", "🌮", "🌯", "🍳", "🍲", "🍿", "🍱", "🍘", "🍙", "🍚", "🍛", "🍜", "🍝", "🍠", "🍢", "🍣", "🍤", "🍥", "🍡", "🦀", "🍦", "🍧", "🍨", "🍩", "🍪", "🎂", "🍰", "🍫", "🍬", "🍭", "🍮", "🍯", "🍼", "☕", "🍵", "🍶", "🍾", "🍷", "🍸", "🍹", "🍺", "🍻", "🍽", "🍴", "🔪"), new w9j() { // from class: l.doj0
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(eoj0.f3343a.mo3920b((String) obj));
            }
        });

        /* JADX INFO: renamed from: d */
        public static void m3918d() {
        }
    }
}
