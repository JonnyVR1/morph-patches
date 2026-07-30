package com.p000p1.mobile.putong.core.p001ui.onlinematch;

import com.p1.mobile.putong.core.data.Bubbles;
import com.p1.mobile.putong.core.data.ChatRoomBubble;
import com.p1.mobile.putong.data.Emotion;
import l.gf3;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SquareDataWrapper extends gf3 {

    /* JADX INFO: renamed from: e */
    public Type f482e = Type.momentState;

    /* JADX INFO: renamed from: f */
    public Bubbles f483f;

    /* JADX INFO: renamed from: g */
    public OnlineMatchPushUser f484g;

    /* JADX INFO: renamed from: h */
    public ChatRoomBubble f485h;

    /* JADX INFO: renamed from: i */
    public Emotion f486i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static class Type {
        private static final /* synthetic */ Type[] $VALUES = $values();
        public static final Type chatRoom;
        public static final Type momentChatRoom;
        public static final Type momentState;
        public static final Type quickChat;

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper$Type$1 */
        public final enum C00301 extends Type {
            private C00301(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper.Type
            public int getType() {
                return 0;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper$Type$2 */
        public final enum C00312 extends Type {
            private C00312(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper.Type
            public String getStateType() {
                return "popup";
            }

            @Override // com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper.Type
            public int getType() {
                return 1;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper$Type$3 */
        public final enum C00323 extends Type {
            private C00323(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper.Type
            public String getStateType() {
                return "audio";
            }

            @Override // com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper.Type
            public int getType() {
                return 2;
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper$Type$4 */
        public final enum C00334 extends Type {
            private C00334(String str, int i) {
                super(str, i);
            }

            @Override // com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper.Type
            public String getStateType() {
                return "momentChatRoom";
            }

            @Override // com.p1.mobile.putong.core.ui.onlinematch.SquareDataWrapper.Type
            public int getType() {
                return 3;
            }
        }

        private static /* synthetic */ Type[] $values() {
            return new Type[]{momentState, quickChat, chatRoom, momentChatRoom};
        }

        static {
            momentState = new C00301("momentState", 0);
            quickChat = new C00312("quickChat", 1);
            chatRoom = new C00323("chatRoom", 2);
            momentChatRoom = new C00334("momentChatRoom", 3);
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public String getStateType() {
            return "";
        }

        public int getType() {
            return 0;
        }

        private Type(String str, int i) {
            super(str, i);
        }
    }
}
