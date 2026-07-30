package org.eclipse.jetty.server;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import l.bke0;
import l.gke0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface Authentication {
    public static final Authentication UNAUTHENTICATED = new Authentication() { // from class: org.eclipse.jetty.server.Authentication.1
        public String toString() {
            return "UNAUTHENTICATED";
        }
    };
    public static final Authentication NOT_CHECKED = new Authentication() { // from class: org.eclipse.jetty.server.Authentication.2
        public String toString() {
            return "NOT CHECKED";
        }
    };
    public static final Authentication SEND_CONTINUE = new Challenge() { // from class: org.eclipse.jetty.server.Authentication.3
        public String toString() {
            return "CHALLENGE";
        }
    };
    public static final Authentication SEND_FAILURE = new Failure() { // from class: org.eclipse.jetty.server.Authentication.4
        public String toString() {
            return "FAILURE";
        }
    };
    public static final Authentication SEND_SUCCESS = new SendSuccess() { // from class: org.eclipse.jetty.server.Authentication.5
        public String toString() {
            return "SEND_SUCCESS";
        }
    };

    public interface Challenge extends ResponseSent {
    }

    public interface Deferred extends Authentication {
        Authentication authenticate(bke0 bke0Var);

        Authentication authenticate(bke0 bke0Var, gke0 gke0Var);

        Authentication login(String str, Object obj, bke0 bke0Var);
    }

    public interface Failure extends ResponseSent {
    }

    public interface ResponseSent extends Authentication {
    }

    public interface SendSuccess extends ResponseSent {
    }

    public interface User extends Authentication {
        String getAuthMethod();

        UserIdentity getUserIdentity();

        boolean isUserInRole(UserIdentity.Scope scope, String str);

        void logout();
    }

    public interface Wrapped extends Authentication {
        HttpServletRequest getHttpServletRequest();

        HttpServletResponse getHttpServletResponse();
    }
}
