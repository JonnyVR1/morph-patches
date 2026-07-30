package com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons;

import java.util.HashMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LayoutDesc {

    /* JADX INFO: renamed from: d */
    public static final LayoutDesc f1686d = ComboType.Like_SuperLike_Match.getLayoutDesc();

    /* JADX INFO: renamed from: b */
    public ComboType f1688b;

    /* JADX INFO: renamed from: a */
    public String f1687a = "unknown";

    /* JADX INFO: renamed from: c */
    public final HashMap<ProfileButton.ProfileButtonType, Boolean> f1689c = new HashMap<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class ComboType {
        private static final /* synthetic */ ComboType[] $VALUES = $values();
        public static final ComboType Chat_Single;
        public static final ComboType Chat_VideoChat;
        public static final ComboType CityC;
        public static final ComboType Dislike_Like_SuperLike;
        public static final ComboType Dislike_Like_SuperLike_Match;
        public static final ComboType Explore_Single;
        public static final ComboType Like_Single;
        public static final ComboType Like_SuperLike_Match;
        public static final ComboType Match;
        public static final ComboType None;
        public static final ComboType Recovery_Single;
        public static final ComboType SuperLike;
        public static final ComboType SuperLike_Match;
        public static final ComboType SuperLike_VideoChat;
        public static final ComboType VideoChat;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$1 */
        public final enum C01321 extends ComboType {
            private C01321(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.Like;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m2925c(profileButtonType, bool);
                layoutDesc.m2925c(ProfileButton.ProfileButtonType.Dislike, bool);
                layoutDesc.m2925c(ProfileButton.ProfileButtonType.SuperLike, bool);
                layoutDesc.m2925c(ProfileButton.ProfileButtonType.OneKeyMatch, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$10 */
        public final enum C013310 extends ComboType {
            private C013310(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m2925c(ProfileButton.ProfileButtonType.CityGreet, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$11 */
        public final enum C013411 extends ComboType {
            private C013411(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m2925c(ProfileButton.ProfileButtonType.Chat, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$12 */
        public final enum C013512 extends ComboType {
            private C013512(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m2925c(ProfileButton.ProfileButtonType.Recovery, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$13 */
        public final enum C013613 extends ComboType {
            private C013613(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = super.getLayoutDesc();
                layoutDesc.m2925c(ProfileButton.ProfileButtonType.Like, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$14 */
        public final enum C013714 extends ComboType {
            private C013714(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                return super.getLayoutDesc();
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$15 */
        public final enum C013815 extends ComboType {
            private C013815(String str, int i) {
                super(str, i);
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$2 */
        public final enum C01392 extends ComboType {
            private C01392(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.Like;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m2925c(profileButtonType, bool);
                layoutDesc.m2925c(ProfileButton.ProfileButtonType.SuperLike, bool);
                layoutDesc.m2925c(ProfileButton.ProfileButtonType.OneKeyMatch, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$3 */
        public final enum C01403 extends ComboType {
            private C01403(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.SuperLike;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m2925c(profileButtonType, bool);
                layoutDesc.m2925c(ProfileButton.ProfileButtonType.OneKeyMatch, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$4 */
        public final enum C01414 extends ComboType {
            private C01414(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m2925c(ProfileButton.ProfileButtonType.SuperLike, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$5 */
        public final enum C01425 extends ComboType {
            private C01425(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m2925c(ProfileButton.ProfileButtonType.OneKeyMatch, Boolean.TRUE);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$6 */
        public final enum C01436 extends ComboType {
            private C01436(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.Like;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m2925c(profileButtonType, bool);
                layoutDesc.m2925c(ProfileButton.ProfileButtonType.Dislike, bool);
                layoutDesc.m2925c(ProfileButton.ProfileButtonType.SuperLike, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$7 */
        public final enum C01447 extends ComboType {
            private C01447(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.SuperLike;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m2925c(profileButtonType, bool);
                layoutDesc.m2925c(ProfileButton.ProfileButtonType.VideoChat, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$8 */
        public final enum C01458 extends ComboType {
            private C01458(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                ProfileButton.ProfileButtonType profileButtonType = ProfileButton.ProfileButtonType.Chat;
                Boolean bool = Boolean.TRUE;
                layoutDesc.m2925c(profileButtonType, bool);
                layoutDesc.m2925c(ProfileButton.ProfileButtonType.VideoChat, bool);
                return layoutDesc;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc$ComboType$9 */
        public final enum C01469 extends ComboType {
            private C01469(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.profile.profilelist.buttons.LayoutDesc.ComboType
            public LayoutDesc getLayoutDesc() {
                LayoutDesc layoutDesc = new LayoutDesc(this);
                layoutDesc.m2925c(ProfileButton.ProfileButtonType.VideoChat, Boolean.TRUE);
                return layoutDesc;
            }
        }

        private static /* synthetic */ ComboType[] $values() {
            return new ComboType[]{Dislike_Like_SuperLike_Match, Like_SuperLike_Match, SuperLike_Match, SuperLike, Match, Dislike_Like_SuperLike, SuperLike_VideoChat, Chat_VideoChat, VideoChat, CityC, Chat_Single, Recovery_Single, Like_Single, Explore_Single, None};
        }

        static {
            Dislike_Like_SuperLike_Match = new C01321("Dislike_Like_SuperLike_Match", 0);
            Like_SuperLike_Match = new C01392("Like_SuperLike_Match", 1);
            SuperLike_Match = new C01403("SuperLike_Match", 2);
            SuperLike = new C01414("SuperLike", 3);
            Match = new C01425("Match", 4);
            Dislike_Like_SuperLike = new C01436("Dislike_Like_SuperLike", 5);
            SuperLike_VideoChat = new C01447("SuperLike_VideoChat", 6);
            Chat_VideoChat = new C01458("Chat_VideoChat", 7);
            VideoChat = new C01469("VideoChat", 8);
            CityC = new C013310("CityC", 9);
            Chat_Single = new C013411("Chat_Single", 10);
            Recovery_Single = new C013512("Recovery_Single", 11);
            Like_Single = new C013613("Like_Single", 12);
            Explore_Single = new C013714("Explore_Single", 13);
            None = new C013815("None", 14);
        }

        public static ComboType valueOf(String str) {
            return (ComboType) Enum.valueOf(ComboType.class, str);
        }

        public static ComboType[] values() {
            return (ComboType[]) $VALUES.clone();
        }

        public LayoutDesc getLayoutDesc() {
            return new LayoutDesc(this);
        }

        private ComboType(String str, int i) {
            super(str, i);
        }
    }

    public LayoutDesc(ComboType comboType) {
        this.f1688b = comboType;
    }

    /* JADX INFO: renamed from: a */
    public ComboType m2923a() {
        return this.f1688b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m2924b(ProfileButton.ProfileButtonType profileButtonType) {
        return this.f1689c.containsKey(profileButtonType) && Boolean.TRUE.equals(this.f1689c.get(profileButtonType));
    }

    /* JADX INFO: renamed from: c */
    public void m2925c(ProfileButton.ProfileButtonType profileButtonType, Boolean bool) {
        this.f1689c.put(profileButtonType, bool);
    }

    public String toString() {
        return "LayoutDesc{source='" + this.f1687a + "', comboType=" + this.f1688b + ", layoutDesc=" + this.f1689c + '}';
    }
}
