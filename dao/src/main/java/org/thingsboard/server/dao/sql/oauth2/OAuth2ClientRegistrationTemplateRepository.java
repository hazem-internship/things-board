/**
 * Copyright © 2016-2022 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.dao.sql.oauth2;

import org.springframework.data.repository.CrudRepository;
import org.thingsboard.server.dao.model.sql.OAuth2ClientRegistrationTemplateEntity;

import java.util.UUID;

public interface OAuth2ClientRegistrationTemplateRepository extends CrudRepository<OAuth2ClientRegistrationTemplateEntity, UUID> {

    OAuth2ClientRegistrationTemplateEntity findByProviderId(String providerId);

}
