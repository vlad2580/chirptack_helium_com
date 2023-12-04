/*
 * Copyright (c) - Paul Pinault (aka disk91) - 2020.
 *
 *    Permission is hereby granted, free of charge, to any person obtaining a copy of this software
 *    and associated documentation files (the "Software"), to deal in the Software without restriction,
 *    including without limitation the rights to use, copy, modify, merge, publish, distribute,
 *    sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is
 *    furnished to do so, subject to the following conditions:
 *
 *    The above copyright notice and this permission notice shall be included in all copies or
 *    substantial portions of the Software.
 *
 *    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
 *    FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS
 *    OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 *    WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR
 *    IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package eu.heliumiot.console.jpa.repository;

import eu.heliumiot.console.jpa.db.User;
import eu.heliumiot.console.jpa.db.UserTenant;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserTenantRepository extends CrudRepository<UserTenant, UUID> {

    public UserTenant findOneUserByUserIdAndTenantId(
            UUID userId,
            UUID tenantId
            );


    //@Query(value = "SELECT * from tenant_user where user_id='23e008f4-49e1-4378-b2fc-fff9fc444f3e' and is_admin=true;", nativeQuery = true)
    public List<UserTenant> findUserTenantByUserIdAndIsAdmin(
            UUID userId,
            boolean isAdmin
    );

    public List<UserTenant> findUserTenantByTenantIdAndIsAdmin(
            UUID tenantId,
            boolean isAdmin
    );


    public List<UserTenant> findUserTenantByUserId(
            UUID userId
    );


}