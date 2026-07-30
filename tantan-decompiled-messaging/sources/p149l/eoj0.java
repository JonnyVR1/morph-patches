package p149l;

import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@RequiresApi(19)
public class eoj0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC16652b f92446a = new fye();

    /* JADX INFO: renamed from: l.eoj0$b */
    public interface InterfaceC16652b {
        /* JADX INFO: renamed from: a */
        CharSequence mo117358a(CharSequence charSequence);

        /* JADX INFO: renamed from: b */
        boolean mo117359b(String str);

        /* JADX INFO: renamed from: c */
        void mo117360c(Runnable runnable);
    }

    /* JADX INFO: renamed from: b */
    public static void m117352b() {
        f92446a.mo117360c(new Runnable() { // from class: l.aoj0
            @Override // java.lang.Runnable
            public final void run() {
                eoj0.C16651a.m117357d();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static CharSequence m117353c(CharSequence charSequence) {
        return f92446a.mo117358a(charSequence);
    }

    /* JADX INFO: renamed from: l.eoj0$a */
    public static final class C16651a {

        /* JADX INFO: renamed from: a */
        public static final List<String> f92447a = vwb.m200339n(Arrays.asList("😀", "😃", "😄", "😁", "😆", "😅", "😂", "🙂", "🙃", "😉", "😊", "😇", "😍", "😘", "😗", "☺️", "😚", "😙", "😋", "😛", "😜", "😝", "🤑", "🤗", "🤔", "🤐", "😐", "😑", "😶", "😏", "😒", "🙄", "😬", "😌", "😔", "😪", "😴", "😷", "🤒", "🤕", "😵", "😎", "🤓", "😕", "😟", "🙁", "☹️", "😮", "😯", "😲", "😳", "😦", "😧", "😨", "😰", "😥", "😢", "😭", "😱", "😖", "😣", "😞", "😓", "😩", "😫", "😤", "😡", "😠", "😈", "👿", "💀", "☠️", "💩", "😺", "😸", "😹", "😻", "😼", "😽", "🙀", "😿", "😾", "🙈", "🙉", "🙊", "💋", "💘", "💝", "💖", "💗", "💓", "💞", "💕", "💔", "❤️", "💯", "👋", "🖐", "✋", "🖖", "👌", "✌️", "🤘", "👈", "👉", "👆", "🖕", "👇", "☝️", "👍", "👎", "✊", "👊", "👏", "🙌", "👐", "🙏", "✍️", "💅", "💪", "👂", "👃", "👀", "👁", "👅", "👄", "🙍", "🙎", "🙅", "🙆", "💁", "🙋", "🙇", "👮", "🕵", "🎅", "💆", "💇", "🚶", "🏃", "💃", "🕴", "👯", "🏇", "⛷️", "🏂", "🏌", "🏄", "🚣", "🏊", "⛹️", "🏋", "🚴", "🚵", "🛀", "🛌", "👭", "💏", "💑", "👪"), new w9j() { // from class: l.boj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(eoj0.f92446a.mo117359b((String) obj));
            }
        });

        /* JADX INFO: renamed from: b */
        public static final List<String> f92448b = vwb.m200339n(Arrays.asList("🐶", "🐕", "🐩", "🐺", "🐱", "🐈", "🦁", "🐯", "🐅", "🐆", "🐴", "🐎", "🦄", "🐮", "🐂", "🐃", "🐄", "🐷", "🐖", "🐗", "🐽", "🐏", "🐑", "🐐", "🐪", "🐫", "🐘", "🐭", "🐁", "🐀", "🐹", "🐰", "🐇", "🐿", "🐻", "🐨", "🐼", "🐾", "🦃", "🐔", "🐓", "🐣", "🐤", "🐥", "🐦", "🐧", "🕊", "🐸", "🐊", "🐢", "🐍", "🐲", "🐉", "🐳", "🐋", "🐬", "🐟", "🐠", "🐡", "🐙", "🐚", "🐌", "🐛", "🐜", "🐝", "🐞", "🕷", "🕸", "🦂", "💐", "🌸", "💮", "🏵", "🌹", "🌺", "🌻", "🌼", "🌷", "🌱", "🌲", "🌳", "🌴", "🌵", "🌾", "🌿", "☘️", "🍀", "🍁", "🍂", "🍃"), new w9j() { // from class: l.coj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(eoj0.f92446a.mo117359b((String) obj));
            }
        });

        /* JADX INFO: renamed from: c */
        public static final List<String> f92449c = vwb.m200339n(Arrays.asList("🍇", "🍈", "🍉", "🍊", "🍋", "🍌", "🍍", "🍎", "🍏", "🍐", "🍑", "🍒", "🍓", "🍅", "🍆", "🌽", "🌶", "🍄", "🌰", "🍞", "🧀", "🍖", "🍗", "🍔", "🍟", "🍕", "🌭", "🌮", "🌯", "🍳", "🍲", "🍿", "🍱", "🍘", "🍙", "🍚", "🍛", "🍜", "🍝", "🍠", "🍢", "🍣", "🍤", "🍥", "🍡", "🦀", "🍦", "🍧", "🍨", "🍩", "🍪", "🎂", "🍰", "🍫", "🍬", "🍭", "🍮", "🍯", "🍼", "☕", "🍵", "🍶", "🍾", "🍷", "🍸", "🍹", "🍺", "🍻", "🍽", "🍴", "🔪"), new w9j() { // from class: l.doj0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(eoj0.f92446a.mo117359b((String) obj));
            }
        });

        /* JADX INFO: renamed from: d */
        public static void m117357d() {
        }
    }
}
